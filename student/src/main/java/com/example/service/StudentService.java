package com.example.service;


import java.util.List;

import com.example.model.StudentModel;

public interface StudentService {
    public StudentModel saveStudentModel(StudentModel studentModel);
    public List<StudentModel> getAllStudents();
}
