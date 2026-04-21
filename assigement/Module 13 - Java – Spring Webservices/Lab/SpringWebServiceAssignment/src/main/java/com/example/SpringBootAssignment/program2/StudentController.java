package com.example.SpringBootAssignment.program2;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(1, "John Doe", "john@example.com", "Java"));
        students.add(new Student(2, "Jane Smith", "jane@example.com", "Python"));
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully!";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(updatedStudent.getName());
                s.setEmail(updatedStudent.getEmail());
                s.setCourse(updatedStudent.getCourse());
                return "Student updated successfully!";
            }
        }
        return "Student not found!";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        students.removeIf(s -> s.getId() == id);
        return "Student deleted successfully!";
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentController.class, args);
    }
}
