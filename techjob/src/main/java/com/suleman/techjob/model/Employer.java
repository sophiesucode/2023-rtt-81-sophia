package com.suleman.techjob.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;
/**
 * The Employer class represents an employer entity in the DiversityTech Job Board.
 * Employers are associated with job listings and can have multiple jobs listed.
 * This class is used to store employer-related data.
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "employer",fetch = FetchType.EAGER)
    private List<Job> jobList;

    public Employer(String name, List<Job> jobList) {
        this.name = name;
        this.jobList = jobList;
    }

    public Employer(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
