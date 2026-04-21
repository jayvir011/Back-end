package com.example.SpringBootAssignment.program5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/program5")
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;
    @Autowired
    private CourseRepository courseRepo;

    private final String UPLOAD_DIR = "uploads/";

    // CRUD: Get all with Pagination
    @GetMapping("/students")
    public Page<Student> getStudents(@RequestParam(defaultValue = "0") int page, 
                                    @RequestParam(defaultValue = "2") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return studentRepo.findAll(pageable);
    }

    // CRUD: Add Student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    // CRUD: Update Student
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student details) {
        Student student = studentRepo.findById(id).get();
        student.setName(details.getName());
        student.setEmail(details.getEmail());
        student.setCourse(details.getCourse());
        return studentRepo.save(student);
    }

    // CRUD: Delete Student
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentRepo.deleteById(id);
        return "Student deleted!";
    }

    // Fetch by Course ID
    @GetMapping("/students/course/{courseId}")
    public List<Student> getByCourse(@PathVariable Long courseId) {
        return studentRepo.findByCourseId(courseId);
    }

    // Image Upload
    @PostMapping("/students/{id}/upload")
    public String uploadImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        File uploadFolder = new File(UPLOAD_DIR);
        if (!uploadFolder.exists()) uploadFolder.mkdirs();

        String fileName = id + "_" + file.getOriginalFilename();
        Path filePath = Paths.get(UPLOAD_DIR + fileName);
        Files.write(filePath, file.getBytes());

        Student student = studentRepo.findById(id).get();
        student.setImageName(fileName);
        studentRepo.save(student);
        return "Image uploaded: " + fileName;
    }

    // Image Download
    @GetMapping("/students/image/{fileName}")
    public ResponseEntity<byte[]> downloadImage(@PathVariable String fileName) throws IOException {
        Path path = Paths.get(UPLOAD_DIR + fileName);
        byte[] image = Files.readAllBytes(path);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }

    // Helper to add a course for testing
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return courseRepo.save(course);
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentController.class, args);
    }
}
