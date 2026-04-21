package com.example.DoctorFinder.controller;

import com.example.DoctorFinder.entity.Admin;
import com.example.DoctorFinder.entity.Doctor;
import com.example.DoctorFinder.entity.Patient;
import com.example.DoctorFinder.service.AdminService;
import com.example.DoctorFinder.service.DoctorService;
import com.example.DoctorFinder.service.PatientService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(@RequestParam(required = false) String role, Model model) {
        model.addAttribute("role", role);
        return "register";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, @RequestParam String role, HttpSession session, Model model) {
        if ("admin".equals(role)) {
            Admin admin = adminService.login(email, password);
            if (admin != null) {
                session.setAttribute("user", admin);
                session.setAttribute("role", "admin");
                return "redirect:/admin/dashboard";
            }
        } else if ("doctor".equals(role)) {
            Doctor doctor = doctorService.login(email, password);
            if (doctor != null) {
                session.setAttribute("user", doctor);
                session.setAttribute("role", "doctor");
                return "redirect:/doctor/dashboard";
            }
        } else if ("patient".equals(role)) {
            Patient patient = patientService.login(email, password); // Note: email field in login form used for patient username as well for simplicity
            if (patient != null) {
                session.setAttribute("user", patient);
                session.setAttribute("role", "patient");
                return "redirect:/patient/dashboard";
            }
        }
        model.addAttribute("error", "Invalid credentials or role");
        return "login";
    }

    @PostMapping("/register-patient")
    public String registerPatient(@ModelAttribute Patient patient) {
        patientService.save(patient);
        return "redirect:/?msg=registered";
    }
    
    @PostMapping("/register-doctor")
    public String registerDoctor(@ModelAttribute Doctor doctor) {
        doctorService.save(doctor);
        return "redirect:/?msg=registered";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
