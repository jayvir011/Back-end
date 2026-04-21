package com.example.SpringBootAssignment.program3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class StudentWebController {

    @GetMapping("/view-students")
    public String showStudents(Model model) {
        List<Student> students = Arrays.asList(
            new Student("John Doe", "Java"),
            new Student("Jane Smith", "Python"),
            new Student("Bob Martin", "Spring Boot")
        );
        model.addAttribute("students", students);
        return "students";
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentWebController.class, args);
    }
}
