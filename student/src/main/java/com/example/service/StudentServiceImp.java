package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.StudentModel;
import com.example.repository.StudentRepo;
@Service
public class StudentServiceImp implements StudentService
{
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentModel saveStudentModel(StudentModel studentModel)
    {
        return studentRepo.save(studentModel);
    }

    @Override
    public List<StudentModel> getAllStudents()
    {
        return studentRepo.findAll();
    }

}
