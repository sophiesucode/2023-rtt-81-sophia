package com.suleman.techjob.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Category {
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Job> jobList;

    public Category() {
        super();
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
