package com.suleman.sms.jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.suleman.sms.jpa.dao.CourseDao;
import com.suleman.sms.jpa.entitymodels.Course;

public class CourseService implements CourseDao {

	@Override
	public List<Course> getAllCourses() {
		try{Session session = HibernateService.getConnection();
		Transaction t= null;
		 t = session.beginTransaction();
		List<Course> courses= null;
		
		Query<Course> query = session.createQuery("from Course", Course.class);
	     courses = query.getResultList();
	     System.out.println("All Courses:");
	     
	     for(Course course:courses) {
	    	 System.out.println("ID: "+course.getCid()+" Course Name: "+course.getcName()+"  " +"Instructor:"+ course.getcInstructorName());
				
	     }
	     t.commit();
	     session.close();
		return courses;
	}catch(Exception e) {
		throw e;
	}
	
		
	}

}
