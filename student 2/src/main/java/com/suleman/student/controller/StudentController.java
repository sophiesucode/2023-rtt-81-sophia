package com.suleman.student.controller;

import com.suleman.student.entity.Student;

import com.suleman.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {


    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping("/students")
    public List<Student> getAllStudents(){

        List<Student> students = studentServiceImpl.findAllStudents();
        return students;
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable Long id){

        Optional<Student> student = studentServiceImpl.findStudentById(id);
        return student;
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") Long id){

        studentServiceImpl.deleteStudent(id);
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestBody Student student){
        studentServiceImpl.save(student);
    }
}
