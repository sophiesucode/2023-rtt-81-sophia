package com.suleman.student.studentrepository;

import com.suleman.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findAll();
    Student findStudentsById(Long id);


}
