package com.suleman.techjob.model;

import jakarta.persistence.*;
import lombok.*;
/**
 * The Job class represents a job listing in the DiversityTech Job Board.
 * It contains information about the job title, company, salary, and other details.
 * This class is part of the model layer and is used to store job-related data.
 */

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String experienceLevel;


    private String jobTitle;


    private String salary;

    private String jobDescription;

    private String company;

    private String location;

    private String url;

    private String imgUrl;

    public Job(String experienceLevel, String jobTitle, String salary, String jobDescription, String company, String location, String url, String imgUrl) {
        this.experienceLevel = experienceLevel;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.company = company;
        this.location = location;
        this.url = url;
        this.imgUrl = imgUrl;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employer_id")
    private Employer employer;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
