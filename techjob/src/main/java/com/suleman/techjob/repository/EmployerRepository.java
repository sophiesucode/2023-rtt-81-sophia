package com.suleman.techjob.repository;

import com.suleman.techjob.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer,Long>{
    Employer findEmployerByName(String name);

    Employer findEmployerById(Long id);



}
