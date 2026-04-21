package com.example.DoctorFinder.controller;

import com.example.DoctorFinder.entity.Doctor;
import com.example.DoctorFinder.entity.Location;
import com.example.DoctorFinder.entity.Patient;
import com.example.DoctorFinder.service.DoctorService;
import com.example.DoctorFinder.service.LocationService;
import com.example.DoctorFinder.service.PatientService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private LocationService locationService;

    private boolean isAdmin(HttpSession session) {
        return "admin".equals(session.getAttribute("role"));
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session) {
        if (!isAdmin(session)) return "redirect:/";
        return "admin_dashboard";
    }

    // Doctor Management
    @GetMapping("/doctors")
    public String viewDoctors(HttpSession session, Model model) {
        if (!isAdmin(session)) return "redirect:/";
        model.addAttribute("doctors", doctorService.getAll());
        return "doctor_list";
    }

    @GetMapping("/add-doctor")
    public String addDoctorForm(HttpSession session, Model model) {
        if (!isAdmin(session)) return "redirect:/";
        model.addAttribute("locations", locationService.getAll());
        return "add_doctor";
    }

    @PostMapping("/save-doctor")
    public String saveDoctor(@ModelAttribute Doctor doctor, HttpSession session) {
        if (!isAdmin(session)) return "redirect:/";
        doctorService.save(doctor);
        return "redirect:/admin/doctors";
    }

    @GetMapping("/edit-doctor/{id}")
    public String editDoctor(@PathVariable Long id, HttpSession session, Model model) {
        if (!isAdmin(session)) return "redirect:/";
        model.addAttribute("doctor", doctorService.findById(id));
        model.addAttribute("locations", locationService.getAll());
        return "edit_doctor";
    }

    @GetMapping("/delete-doctor/{id}")
    public String deleteDoctor(@PathVariable Long id, HttpSession session) {
        if (!isAdmin(session)) return "redirect:/";
        doctorService.deleteById(id);
        return "redirect:/admin/doctors";
    }

    // Patient Management
    @GetMapping("/patients")
    public String viewPatients(HttpSession session, Model model) {
        if (!isAdmin(session)) return "redirect:/";
        model.addAttribute("patients", patientService.getAll());
        return "patient_list_admin";
    }

    @GetMapping("/delete-patient/{id}")
    public String deletePatient(@PathVariable Long id, HttpSession session) {
        if (!isAdmin(session)) return "redirect:/";
        patientService.deleteById(id);
        return "redirect:/admin/patients";
    }

    // Location Management
    @GetMapping("/locations")
    public String viewLocations(HttpSession session, Model model) {
        if (!isAdmin(session)) return "redirect:/";
        model.addAttribute("locations", locationService.getAll());
        return "location_list";
    }

    @PostMapping("/add-location")
    public String addLocation(@RequestParam String name, HttpSession session) {
        if (!isAdmin(session)) return "redirect:/";
        Location loc = new Location();
        loc.setName(name);
        locationService.save(loc);
        return "redirect:/admin/locations";
    }

    @GetMapping("/delete-location/{id}")
    public String deleteLocation(@PathVariable Long id, HttpSession session) {
        if (!isAdmin(session)) return "redirect:/";
        locationService.deleteById(id);
        return "redirect:/admin/locations";
    }
}
