package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StaffModel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;

    private String staffEmail;
    private String staffPassword;
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public String getStaffEmail() {
        return staffEmail;
    }
    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }
    public String getStaffPassword() {
        return staffPassword;
    }
    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }
    public StaffModel()
    {
        
    }
    public StaffModel(int staffId, String staffEmail, String staffPassword) {
        this.staffId = staffId;
        this.staffEmail = staffEmail;
        this.staffPassword = staffPassword;
    }
}
