package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AdminModel;
import com.example.service.AdminService;

@RestController
@RequestMapping("/adminModel")
@CrossOrigin
public class AdminController 
{
    @Autowired
    public AdminService adminService;

    @PostMapping("/add")
    public String add(@RequestBody AdminModel adminModel)
    {
        adminService.saveAdminModel(adminModel);
        return "Admin is added";
    }

    @GetMapping("/getAll")
    public List<AdminModel> getAllAdminModels()
    {
        return adminService.getAllAdmin();
    }
}
