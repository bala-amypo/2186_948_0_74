package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public StudentEntity updateStudent(
            @PathVariable Long id,
            @RequestBody StudentEntity student) {
        return service.updateByid(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return service.deleteById(id);
    }
}
