package com.example.DoctorFinder.controller;

import com.example.DoctorFinder.entity.Appointment;
import com.example.DoctorFinder.entity.Doctor;
import com.example.DoctorFinder.entity.Patient;
import com.example.DoctorFinder.service.AppointmentService;
import com.example.DoctorFinder.service.PatientService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PatientService patientService;

    private boolean isDoctor(HttpSession session) {
        return "doctor".equals(session.getAttribute("role"));
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        if (!isDoctor(session)) return "redirect:/";
        Doctor doctor = (Doctor) session.getAttribute("user");
        
        List<Patient> patients = patientService.getAll();
        Map<Long, Patient> patientMap = patients.stream().collect(Collectors.toMap(Patient::getId, p -> p));
        
        model.addAttribute("patientMap", patientMap);
        model.addAttribute("pendingAppointments", appointmentService.findByDoctorIdAndStatus(doctor.getId(), "PENDING"));
        model.addAttribute("approvedAppointments", appointmentService.findByDoctorIdAndStatus(doctor.getId(), "APPROVED"));
        return "doctor_dashboard";
    }

    @GetMapping("/approve-appointment/{id}")
    public String approveAppointment(@PathVariable Long id, HttpSession session) {
        if (!isDoctor(session)) return "redirect:/";
        Appointment appointment = appointmentService.findById(id);
        if (appointment != null) {
            appointment.setStatus("APPROVED");
            appointmentService.save(appointment);
        }
        return "redirect:/doctor/dashboard";
    }

    @GetMapping("/reject-appointment/{id}")
    public String rejectAppointment(@PathVariable Long id, HttpSession session) {
        if (!isDoctor(session)) return "redirect:/";
        Appointment appointment = appointmentService.findById(id);
        if (appointment != null) {
            appointment.setStatus("REJECTED");
            appointmentService.save(appointment);
        }
        return "redirect:/doctor/dashboard";
    }

    @GetMapping("/appointments")
    public String viewAppointments(HttpSession session, Model model) {
        if (!isDoctor(session)) return "redirect:/";
        Doctor doctor = (Doctor) session.getAttribute("user");
        model.addAttribute("appointments", appointmentService.findByDoctorId(doctor.getId()));
        return "appointment_list_doctor";
    }

    @GetMapping("/search-appointment")
    public String searchAppointment(@RequestParam(required = false) Long id, HttpSession session, Model model) {
        if (!isDoctor(session)) return "redirect:/";
        if (id != null) {
            model.addAttribute("foundAppointment", appointmentService.findById(id));
        }
        return "search_appointment";
    }

    @GetMapping("/patients")
    public String viewPatients(HttpSession session, Model model) {
        if (!isDoctor(session)) return "redirect:/";
        model.addAttribute("patients", patientService.getAll());
        return "patient_list_doctor";
    }

    @GetMapping("/search-patient")
    public String searchPatient(@RequestParam(required = false) Long id, HttpSession session, Model model) {
        if (!isDoctor(session)) return "redirect:/";
        if (id != null) {
            model.addAttribute("foundPatient", patientService.findById(id));
        }
        return "search_patient";
    }

    @GetMapping("/add-appointment")
    public String addAppointmentForm(HttpSession session, Model model) {
        if (!isDoctor(session)) return "redirect:/";
        model.addAttribute("patients", patientService.getAll());
        return "appointment_form_doctor";
    }

    @PostMapping("/save-appointment")
    public String saveAppointment(@ModelAttribute Appointment appointment, HttpSession session) {
        if (!isDoctor(session)) return "redirect:/";
        Doctor doctor = (Doctor) session.getAttribute("user");
        appointment.setDoctorId(doctor.getId());
        appointmentService.save(appointment);
        return "redirect:/doctor/appointments";
    }
}
