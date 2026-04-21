package com.example.DoctorFinder.service;

import com.example.DoctorFinder.entity.Admin;
import com.example.DoctorFinder.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin login(String email, String password) {
        return adminRepository.findByEmailAndPassword(email, password).orElse(null);
    }

    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }
    
    public long count() {
        return adminRepository.count();
    }
}
