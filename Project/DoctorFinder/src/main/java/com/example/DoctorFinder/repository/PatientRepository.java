package com.example.DoctorFinder.repository;

import com.example.DoctorFinder.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByUsernameAndPassword(String username, String password);
}
