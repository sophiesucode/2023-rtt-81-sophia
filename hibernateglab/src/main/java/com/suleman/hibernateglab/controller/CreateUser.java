package com.suleman.hibernateglab.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suleman.hibernateglab.model.User;





public class CreateUser {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t= session.beginTransaction();
		
		User uone = new User();
		uone.setFullname("Jessie Mildridge");
		uone.setEmail("haseeb@gmail.com");
		uone.setPassword("jgirl101");
		uone.setAge(29);
		uone.setSalary(200000.00);
		uone.setCity("Baltimore");
		
		
		
		User utwo= new User();
		utwo.setEmail("James@gmail.com");
		utwo.setFullname("James Santana");
		utwo.setPassword("James123");
		utwo.setAge(25);
		utwo.setSalary(40000.00);
		utwo.setCity("Dallas");
	
		
		
		User uthree= new User();
		uthree.setEmail("Mack@gmail.com");
		uthree.setFullname("Mary Mack");
		uthree.setPassword("mary123");
		uthree.setAge(19);
		uthree.setSalary(50000.00);
		uthree.setCity("Jefferson");
		
		

		
		User ufour = new User("Sid", "Sid@gmail.com","1234", 35,60000.00,"Atlanta");
		User ufive = new User("Tammy", "lee@gmail", "s258", 29, 4000.36, "LA");
				
		
		session.persist(uone);
		session.persist(utwo);
		session.persist(uthree);
		session.persist(ufour);
		session.persist(ufive);
		
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
		
		
	}
}
