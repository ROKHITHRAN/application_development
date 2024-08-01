package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.StaffModel;
@Repository
public interface StaffRepo extends JpaRepository<StaffModel,Integer>
{
    
}
