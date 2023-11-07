package com.suleman.sms.jpa.dao;

import java.util.List;

import com.suleman.sms.jpa.entitymodels.Course;
import com.suleman.sms.jpa.entitymodels.Student;

public interface StudentDao {
	
	List<Student>getAllStudents();
	
	Student getStudentByEmail(String sEmail);
	
	boolean validateStudent(String sEmail, String password);
	
	void registerStudentToCourse(String sEmail, int cId);
	
	
	
	List<Course> getStudentCourses(String sEmail);

}
