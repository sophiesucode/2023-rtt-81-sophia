package com.suleman.department.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class Department {

	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String name;
	private String state;
	
	
	public Department() {
		
	}


	public Department(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	
	
	
	
	
}
