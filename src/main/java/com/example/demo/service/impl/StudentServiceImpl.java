package com.example.demo.service.impl;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.exception.*;
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
    return repo.findById(id).orElseThrow(() -> throw new StudentNotFoundException(errMsg:"Student id not found"));

}
public StudentEntity updateByid( Long id, StudentEntity newstu){
    StudentEntity existing=getbyId(id);
    newstu.setId(existing.getId());
    return repo.save(newstu);
}
public StudentEntity deleteById(Long id){
    StudentEntity data = getById(id);
    repo.deleteById(id);
    return "Deleted Successfully !";
}
}