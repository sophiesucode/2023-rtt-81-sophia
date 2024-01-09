package com.suleman.techjob.service;

import com.suleman.techjob.Exceptions.InformationNotFoundException;
import com.suleman.techjob.model.Job;
import com.suleman.techjob.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Job createJob(Job jobObject) {
        Job job = jobRepository.findJobByTitle(jobObject.getJobTitle());
        return jobRepository.save(jobObject);
    }

    public Optional<Job> getJob(Long jobId) {

        Optional<Job> job = jobRepository.findById(jobId);
        if(job.isPresent()){
            return job;
        }else{
            throw new InformationNotFoundException("job with Id " + jobId + " not found");
        }
    }

    public Job updateJob(Long jobId, Job jobObject){

        Optional<Job> job = jobRepository.findById(jobId);
        if(job.isPresent()){
            Job updateJob = jobRepository.findById(jobId).get();
            updateJob.setJobTitle(jobObject.getJobTitle());
            updateJob.setSalary(jobObject.getSalary());
            updateJob.setExperienceLevel(jobObject.getExperienceLevel());
            updateJob.setJobDescription(jobObject.getJobDescription());
            updateJob.setCompany(jobObject.getCompany());
            updateJob.setLocation(jobObject.getLocation());

            return jobRepository.save(updateJob);
        }else{
            throw new InformationNotFoundException("job with id " + jobId + " not found");
        }
    }


    public Optional<Job> deleteJob(Long jobId){

        Optional<Job> job = jobRepository.findById(jobId);
        if(job.isPresent()){
            jobRepository.deleteById(jobId);
            return job;
        }else{
            throw new InformationNotFoundException("Job with id " + jobId +" not found");
        }
    }

    public List<Job> getJobByCategory(Long categoryId){
        return jobRepository.findAllByCategoryId(categoryId);
    }

    public List<Job> listAll() {

        return jobRepository.findAll();
    }

}
