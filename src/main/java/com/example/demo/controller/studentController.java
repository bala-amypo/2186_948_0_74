package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class studentController{
    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
        
    }
}