package com.example.program4;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(UserRegistration userRegistration) {
        return "program4/register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid UserRegistration userRegistration, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "program4/register";
        }
        return "redirect:/register?success";
    }
}
