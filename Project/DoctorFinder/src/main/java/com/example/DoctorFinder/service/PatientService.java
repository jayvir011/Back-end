package com.example.DoctorFinder.service;

import com.example.DoctorFinder.entity.Patient;
import com.example.DoctorFinder.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient findById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient login(String username, String password) {
        return patientRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

    public long count() {
        return patientRepository.count();
    }
}
