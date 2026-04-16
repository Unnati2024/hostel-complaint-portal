package com.hostel.complaintsystem.service;

import com.hostel.complaintsystem.entity.Student;
import com.hostel.complaintsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student loginStudent(String email, String password) {
        Student student = studentRepository.findByEmail(email);
        if(student != null && student.getPassword().equals(password)) {
            return student;
        }
        return null;
    }
}