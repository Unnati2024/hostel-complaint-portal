package com.hostel.complaintsystem.controller;

import com.hostel.complaintsystem.entity.Student;
import com.hostel.complaintsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }

    @PostMapping("/login")
    public Student login(@RequestParam String email,
                         @RequestParam String password) {
        return studentService.loginStudent(email, password);
    }
}