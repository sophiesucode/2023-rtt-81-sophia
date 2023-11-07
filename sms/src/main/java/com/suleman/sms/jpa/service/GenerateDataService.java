package com.suleman.sms.jpa.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suleman.sms.jpa.entitymodels.Course;
import com.suleman.sms.jpa.entitymodels.Student;

public class GenerateDataService {
public void createData() {
		
		Session session = HibernateService.getConnection();
		Transaction t = session.beginTransaction();
		
		
//    	Course c1 = new Course("Intro to Programming", "David Jackson");
//	    Course c2 = new Course("Java Programming", "James Smith");
//	    Course c3 = new Course("Design", "Janet Bond");
//		
//		session.persist(c1);
//		session.persist(c2);
//		session.persist(c3);
		
		
		Student s1= new Student("lee@gmail.com","Amy Lee","1234Lee88");
	session.persist(s1);
	t.commit();
	
	
	
	
		}

}
