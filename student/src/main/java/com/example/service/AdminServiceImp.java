package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AdminModel;
import com.example.repository.AdminRepo;

@Service
public class AdminServiceImp implements AdminService
{
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public AdminModel saveAdminModel(AdminModel adminModel)
    {
        return adminRepo.save(adminModel);
    }

    @Override
    public List<AdminModel> getAllAdmin()
    {
        return adminRepo.findAll();
    }
}
