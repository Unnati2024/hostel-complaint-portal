package com.hostel.complaintsystem.repository;

import com.hostel.complaintsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);
}