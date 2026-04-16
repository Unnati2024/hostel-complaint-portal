package com.hostel.complaintsystem.controller;

import com.hostel.complaintsystem.entity.Complaint;
import com.hostel.complaintsystem.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin("*")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping("/add")
    public Complaint addComplaint(@RequestBody Complaint complaint) {
        return complaintService.addComplaint(complaint);
    }

    @GetMapping("/all")
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @GetMapping("/student/{id}")
    public List<Complaint> getStudentComplaints(@PathVariable int id) {
        return complaintService.getStudentComplaints(id);
    }

    @PutMapping("/update/{id}")
    public Complaint updateStatus(@PathVariable int id,
                                  @RequestParam String status) {
        return complaintService.updateStatus(id, status);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteComplaint(@PathVariable int id) {
        complaintService.deleteComplaint(id);
    }
}