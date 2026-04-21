package com.example.SpringBootAssignment.program5;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String imageName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
