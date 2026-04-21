package com.example.DoctorFinder.controller;

import com.example.DoctorFinder.entity.Appointment;
import com.example.DoctorFinder.entity.Doctor;
import com.example.DoctorFinder.entity.Patient;
import com.example.DoctorFinder.service.AppointmentService;
import com.example.DoctorFinder.service.DoctorService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private DoctorService doctorService;

    private boolean isPatient(HttpSession session) {
        return "patient".equals(session.getAttribute("role"));
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        if (!isPatient(session)) return "redirect:/";
        Patient patient = (Patient) session.getAttribute("user");
        
        List<Doctor> doctors = doctorService.getAll();
        Map<Long, Doctor> doctorMap = doctors.stream().collect(Collectors.toMap(Doctor::getId, d -> d));
        
        model.addAttribute("doctorMap", doctorMap);
        model.addAttribute("pendingAppointments", appointmentService.findByPatientIdAndStatus(patient.getId(), "PENDING"));
        model.addAttribute("approvedAppointments", appointmentService.findByPatientIdAndStatus(patient.getId(), "APPROVED"));
        return "patient_dashboard";
    }

    @GetMapping("/doctors")
    public String viewDoctors(HttpSession session, Model model) {
        if (!isPatient(session)) return "redirect:/";
        model.addAttribute("doctors", doctorService.getAll());
        return "doctor_list_patient";
    }

    @GetMapping("/book-appointment/{doctorId}")
    public String bookAppointmentPage(@PathVariable Long doctorId, HttpSession session, Model model) {
        if (!isPatient(session)) return "redirect:/";
        model.addAttribute("doctorId", doctorId);
        model.addAttribute("bookedAppointments", appointmentService.findByDoctorIdAndStatus(doctorId, "APPROVED"));
        return "book_appointment";
    }

    @PostMapping("/save-appointment")
    public String saveAppointment(@ModelAttribute Appointment appointment, HttpSession session, RedirectAttributes redirectAttributes) {
        if (!isPatient(session)) return "redirect:/";

        // Check if same doctor, same date, same time already has an APPROVED appointment
        List<Appointment> conflicts = appointmentService.findByDoctorIdAndDateAndTimeAndStatus(
                appointment.getDoctorId(), appointment.getDate(), appointment.getTime(), "APPROVED");

        if (!conflicts.isEmpty()) {
            redirectAttributes.addFlashAttribute("error", "This time slot is already booked");
            return "redirect:/patient/book-appointment/" + appointment.getDoctorId();
        }

        Patient patient = (Patient) session.getAttribute("user");
        appointment.setPatientId(patient.getId());
        appointmentService.save(appointment);
        return "redirect:/patient/appointments";
    }

    @GetMapping("/appointments")
    public String viewAppointments(HttpSession session, Model model) {
        if (!isPatient(session)) return "redirect:/";
        Patient patient = (Patient) session.getAttribute("user");
        model.addAttribute("appointments", appointmentService.findByPatientId(patient.getId()));
        return "appointment_list_patient";
    }

    @GetMapping("/search-appointment")
    public String searchAppointment(@RequestParam(required = false) Long id, HttpSession session, Model model) {
        if (!isPatient(session)) return "redirect:/";
        if (id != null) {
            model.addAttribute("foundAppointment", appointmentService.findById(id));
        }
        return "search_appointment_patient";
    }

    @GetMapping("/deleteAppointment/{id}")
    public String deleteAppointment(@PathVariable Long id, HttpSession session, RedirectAttributes redirectAttributes) {
        if (!isPatient(session)) return "redirect:/";

        Appointment appointment = appointmentService.findById(id);
        Patient patient = (Patient) session.getAttribute("user");

        if (appointment != null && appointment.getPatientId().equals(patient.getId())) {
            if ("APPROVED".equals(appointment.getStatus())) {
                redirectAttributes.addFlashAttribute("error", "You cannot delete confirmed appointment");
            } else {
                appointmentService.deleteById(id);
                redirectAttributes.addFlashAttribute("message", "Appointment deleted successfully");
            }
        }
        return "redirect:/patient/appointments";
    }
}
