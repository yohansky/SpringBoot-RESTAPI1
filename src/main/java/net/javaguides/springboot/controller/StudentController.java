package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    // Rest Api with path variable
    // http://localhost:8080/student/{id}/{firstname}/{lastname}
    @GetMapping("student/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                               @PathVariable("first-name") String firstName,
                               @PathVariable("last-name") String lastName){
        return new Student(studentId, firstName,lastName);
    }

    // Rest Api with Request Param
    // http://localhost:8080/student/query?id=1&fistName=Yohanes&
    @GetMapping("student/query")
    public Student studentbyid(@RequestParam int id,
                               @RequestParam String firstName,
                               @RequestParam String lastName){
     return new Student(id, firstName, lastName);
    }

    //Post
    //@PostMapping & @RequestBody
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

}
