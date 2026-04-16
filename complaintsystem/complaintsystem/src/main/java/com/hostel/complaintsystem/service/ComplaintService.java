package com.hostel.complaintsystem.service;

import com.hostel.complaintsystem.entity.Complaint;
import com.hostel.complaintsystem.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    public Complaint addComplaint(Complaint complaint) {
        complaint.setStatus("Pending");
        complaint.setCreatedAt(java.time.LocalDateTime.now().toString());
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    public List<Complaint> getStudentComplaints(int studentId) {
        return complaintRepository.findByStudentId(studentId);
    }

    public Complaint updateStatus(int id, String status) {
        Complaint complaint = complaintRepository.findById(id).orElse(null);
        if(complaint != null) {
            complaint.setStatus(status);
            return complaintRepository.save(complaint);
        }
        return null;
    }

    public void deleteComplaint(int id) {
        complaintRepository.deleteById(id);
    }
}