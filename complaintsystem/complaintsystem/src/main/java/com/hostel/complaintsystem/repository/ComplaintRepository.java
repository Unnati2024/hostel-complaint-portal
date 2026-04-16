package com.hostel.complaintsystem.repository;

import com.hostel.complaintsystem.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {
    List<Complaint> findByStudentId(int studentId);
}