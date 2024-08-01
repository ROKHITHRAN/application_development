package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.StaffModel;
import com.example.repository.StaffRepo;

@Service
public class StaffServiceImp implements StaffService
{
    @Autowired
    public StaffRepo staffRepo;

    @Override
    public StaffModel saveStaffModel(StaffModel staffModel)
    {
        return staffRepo.save(staffModel);
    }

    @Override
    public List<StaffModel> getAllStaff()
    {
        return staffRepo.findAll();
    }
}
