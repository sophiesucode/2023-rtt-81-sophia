package com.suleman.techjob.controller;

import com.suleman.techjob.model.Job;
import com.suleman.techjob.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping(path = "/jobs/")
    public List<Job> getJobs() {
        System.out.println("calling getJobs ==>");
        return jobService.getAllJobs();
    }

    @GetMapping("/jobs/{jobId}")
    public Optional getJobs(@PathVariable Long jobId){
        System.out.println(("calling getJobs ==>"));
        return jobService.getJob(jobId);
    }

    @PostMapping("/jobs/")
    public Job createJob(@RequestBody Job jobObject) {
        System.out.println("calling createJob ==> ");
        return jobService.createJob(jobObject);

    }

    @PutMapping("/jobs/{jobId}")
    public Job updateJob(@PathVariable(value = "jobId") Long jobId, @RequestBody Job jobObject) {
        System.out.println("calling updateJob ==>");
        return jobService.updateJob(jobId, jobObject);
    }

    @DeleteMapping("/jobs/{jobId}")
    public Optional<Job> deleteJob(@PathVariable(value = "jobId") Long jobId) {
        System.out.println("calling deleteJob ==>");
        return jobService.deleteJob(jobId);
    }



}
