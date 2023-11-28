package com.example.test.controller;

import com.example.test.components.MyComponent;
import com.example.test.models.Student;
import com.example.test.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApi {

    private final StudentService studentService;

    @Autowired
    public RestApi(StudentService studentService) {
        this.studentService = studentService;
    }
    @Autowired
    private MyComponent myComponent;

    @GetMapping("/student")
    public Student saveStudentExample() {

        Student student = new Student();
        student.setName("Teddix");
        return studentService.saveStudent(student);
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping("/all-students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


}
