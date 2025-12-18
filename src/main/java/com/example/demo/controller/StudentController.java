package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentEntity save(@Valid @RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<StudentEntity> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public StudentEntity getById(@PathVariable Long id){
        return service.getById(id);
    }
    @PutMapping("/update{id}")
    public StudentEntity updateByid(@PathVariable Long id,@Valid @RequestBody StudentEntity newstu){
        return service.updateById(id,newstu);
    }
}
