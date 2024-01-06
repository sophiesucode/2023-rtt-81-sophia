package com.suleman.student.service;

import com.suleman.student.entity.Student;
import com.suleman.student.studentrepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {

    // it creates the object for student repo that we are going to use, it injects object , we wont have to create an object
    ///autowire creates the object and injects it for us
    //no longer needs to implement repo since we are using autowire
    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public void save(Student student) {
        studentRepository.save(student);

    }
}