package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class AdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String adminEmail;
    private String adminPassword;
    public int getAdminId() {
        return adminId;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getAdminEmail() {
        return adminEmail;
    }
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
    public String getAdminPassword() {
        return adminPassword;
    }
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public AdminModel()
    {

    }
    public AdminModel(int adminId, String adminEmail, String adminPassword) {
        this.adminId = adminId;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }
}
