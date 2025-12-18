package com.example.demo.service.impl;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import com.example.demo.exception.StudentNotFoundException;

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
    public StudentEntity getById(Long id) {
        return studentRepo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student id not found"));
    }

    @Override
    public StudentEntity updateByid(Long id, StudentEntity newstu) {
        StudentEntity existing = getById(id);
        newstu.setId(existing.getId());
        return studentRepo.save(newstu);
    }

    @Override
    public String deleteById(Long id) {
        getById(id); // validation
        studentRepo.deleteById(id);
        return "Deleted Successfully!";
    }
}
