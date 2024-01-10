package com.suleman.techjob.repository;

import com.suleman.techjob.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {



    Job findByJobTitle(String title);

    List<Job> findAllByCategoryId(Long categoryId);
}
