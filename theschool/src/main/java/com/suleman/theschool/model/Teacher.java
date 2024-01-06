package com.suleman.theschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int teacherId;
	private String teacherName;
	private String salary;
	
	
	public Teacher() {
		
	}

	@ManyToOne
	@JoinColumn(name="fk_dept")
	private Department department;

	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Teacher(String teacherName, String salary) {
		super();
		this.teacherName = teacherName;
		this.salary = salary;
	}


	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", salary=" + salary + "]";
	}

	
	
}
