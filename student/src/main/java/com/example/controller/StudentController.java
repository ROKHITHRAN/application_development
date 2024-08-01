package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudentModel;
import com.example.service.StudentService;

@RestController
@RequestMapping("/studentModel")
@CrossOrigin
public class StudentController 
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody StudentModel studentModel)
    {
        studentService.saveStudentModel(studentModel);
        return "new data added";
    }

    @GetMapping("/getAll")
    public List<StudentModel> getAllStudentModels()
    {
        return studentService.getAllStudents();
    }
}
