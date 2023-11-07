package com.suleman.sms.jpa.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.suleman.sms.jpa.dao.CourseDao;
import com.suleman.sms.jpa.dao.StudentDao;
import com.suleman.sms.jpa.entitymodels.Course;
import com.suleman.sms.jpa.entitymodels.Student;

public class StudentService implements StudentDao {



	@Override
	public List<Student> getAllStudents() {
		Session session = HibernateService.getConnection();
		Transaction t= null;
		 t = session.beginTransaction();
		 
		List<Student> students= null;
		
		Query<Student> query = session.createQuery("from Student", Student.class);
		students = query.getResultList();
		
		for(Student student:students) {
			System.out.println("Name: "+ student.getsName() + " Email: "+student.getsEmail()+" Password: "+student.getsPass());
			
		}
		return students;
	}

	@Override
	public Student getStudentByEmail(String email) {
		Session session = HibernateService.getConnection();
		Transaction t= null;
		 t = session.beginTransaction();
		 Student s = null;
			
			 s= session.get(Student.class,email);
			System.out.println("Name: "+ s.getsName());
			System.out.println("Email: "+s.getsEmail());
			System.out.println("Password: "+ s.getsPass());
	t.commit();
		return s;
	}

	@Override
	public boolean validateStudent(String sEmail, String password) {
		
		try{Session session = HibernateService.getConnection();
		Transaction t= null;
		 t = session.beginTransaction();
		Student student = session.get(Student.class, sEmail);
		
		if(student !=null&& student.getsPass().equals(password)) {
			return true;	
		}
		
	
		return false;
	}catch(Exception e) {
		throw e;
	}}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		try{Session session = HibernateService.getConnection();
		Transaction t= null;
		 t = session.beginTransaction();
		 
		 Student student=session.get(Student.class, sEmail);
		 Course course=session.get(Course.class,cId);
		 
		 List<Course>courses= student.getsCourses();
		 if(student!=null && !courses.contains(cId)) {
			 courses.add(course);
		 }
		 session.update(student);
		 
		 t.commit();
		 session.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		Session session = HibernateService.getConnection();
		Transaction t= null;
		 t = session.beginTransaction();
		 
		 List<Course> courses= null;
		 	
		 Student student=session.get(Student.class, sEmail);
		 courses = student.getsCourses();
		 System.out.println("My Classes:");
		 for(Course course:courses) {
				System.out.println("id: "+course.getCid()+" Course Name: "+course.getcName()+"  " +"Instructor:"+ course.getcInstructorName());
				
			};
			session.close();
			return courses;
		
	}
	
	
	




}
