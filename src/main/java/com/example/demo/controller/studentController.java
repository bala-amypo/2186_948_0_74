package com.example.demo.controller;

import jakarta.validation.valid;

import org.springframework.web.bind.annotation.*;

@RestController

public class studentController{

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
       return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@valid @RequestBody studentEntity student){
      return service.addStudent(student);
    }
}