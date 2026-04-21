package com.example.DoctorFinder.service;

import com.example.DoctorFinder.entity.Doctor;
import com.example.DoctorFinder.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }

    public Doctor findById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor login(String email, String password) {
        return doctorRepository.findByEmailAndPassword(email, password).orElse(null);
    }

    public long count() {
        return doctorRepository.count();
    }
}
