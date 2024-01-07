package com.suleman.techjob.model;

import jakarta.persistence.*;
import lombok.*;

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


//    private Employer employer;
//
//    private Category category;


}
