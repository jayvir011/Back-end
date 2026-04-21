package com.example.DoctorFinder.service;

import com.example.DoctorFinder.entity.Appointment;
import com.example.DoctorFinder.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment save(Appointment appointment) {
        if (appointment.getStatus() == null) {
            appointment.setStatus("PENDING");
        }
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    public List<Appointment> findByPatientId(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    public List<Appointment> findByPatientIdAndStatus(Long patientId, String status) {
        return appointmentRepository.findByPatientIdAndStatus(patientId, status);
    }

    public List<Appointment> findByDoctorId(Long doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }

    public List<Appointment> findByDoctorIdAndStatus(Long doctorId, String status) {
        return appointmentRepository.findByDoctorIdAndStatus(doctorId, status);
    }

    public List<Appointment> findByDoctorIdAndDateAndStatus(Long doctorId, String date, String status) {
        return appointmentRepository.findByDoctorIdAndDateAndStatus(doctorId, date, status);
    }

    public List<Appointment> findByDoctorIdAndDateAndTimeAndStatus(Long doctorId, String date, String time, String status) {
        return appointmentRepository.findByDoctorIdAndDateAndTimeAndStatus(doctorId, date, time, status);
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
    }
}
