package com.example.demo.service.impl;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }
    @Override
    public StudentEntity getById(Long id){
    return repo.findById(id).orElseThrow() -> new StudentNotFoundExce[

}
