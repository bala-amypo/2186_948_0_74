package com.example.demo.controller;

import jakarta.validation.valid;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;
import java.util.*;

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