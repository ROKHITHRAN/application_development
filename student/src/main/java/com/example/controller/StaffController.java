package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StaffModel;
import com.example.service.StaffService;

@RestController
@RequestMapping("/staffModel")
@CrossOrigin
public class StaffController 
{
    @Autowired
    public StaffService staffService;

    @PostMapping("/add")
    public String add(@RequestBody StaffModel staffModel)
    {
        staffService.saveStaffModel(staffModel);
        return "Staff is added";
    }

    @GetMapping("/getAll")
    public List<StaffModel> getAllStaffModels()
    {
        return staffService.getAllStaff();
    }
}
