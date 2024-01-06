package com.suleman.theschool.model;


 import java. io. Serializable;
import javax.persistence. Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence. Table;


@Entity
@Table
public class Teacher1M implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int teacherld;
private String salary;
private String teacherName;



public Teacher1M() {
	
}

//public Teacher1M(int teacherld, String salary, String teacherName) {
//	
//	this.teacherld = teacherld;
//	this.salary = salary;
//	this.teacherName = teacherName;
//}

public int getTeacherld() {
	return teacherld;
}
public void setTeacherld(int teacherld) {
	this.teacherld = teacherld;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
@Override
public String toString() {
	return "Teacher1M [teacherld=" + teacherld + ", salary=" + salary + ", teacherName=" + teacherName + "]";
}






}