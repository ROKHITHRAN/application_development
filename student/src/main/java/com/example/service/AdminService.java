package com.example.service;

import java.util.List;


import com.example.model.AdminModel;

public interface AdminService {
    public AdminModel saveAdminModel(AdminModel adminModel);
    public List<AdminModel> getAllAdmin();
}
