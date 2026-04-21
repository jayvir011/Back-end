package com.example.DoctorFinder.repository;

import com.example.DoctorFinder.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long patientId);
    List<Appointment> findByPatientIdAndStatus(Long patientId, String status);
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByDoctorIdAndStatus(Long doctorId, String status);
    List<Appointment> findByDoctorIdAndDateAndStatus(Long doctorId, String date, String status);
    List<Appointment> findByDoctorIdAndDateAndTimeAndStatus(Long doctorId, String date, String time, String status);
}
