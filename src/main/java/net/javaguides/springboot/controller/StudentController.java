package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Yohanes",
                "Hubert"
        );
        return student;
    }

    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Yohanes","Hubert"));
        students.add(new Student(2,"Hubert","Yohanes"));
        students.add(new Student(3,"Joey","Yohanes"));
        students.add(new Student(4,"Hubert","Joey"));
        return students;
    }
}
