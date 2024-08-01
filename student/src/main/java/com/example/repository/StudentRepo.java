package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.StudentModel;
@Repository
public interface StudentRepo extends JpaRepository<StudentModel,Integer> 
{

    
} 
