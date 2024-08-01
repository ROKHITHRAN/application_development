package com.example.service;

import java.util.List;

import com.example.model.StaffModel;

public interface StaffService 
{
    public StaffModel saveStaffModel(StaffModel staffModel);
    public List<StaffModel> getAllStaff();
}
