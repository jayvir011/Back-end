package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course_tab")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<StudentMM> students = new ArrayList<>();

    public Course() {}
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public List<StudentMM> getStudents() { return students; }
    public void setStudents(List<StudentMM> students) { this.students = students; }
}
