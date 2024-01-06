package com.suleman.hibernateuser.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suleman.hibernateuser.model.User;

public class UserService {

	public void createUserTable() {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction t= session.beginTransaction();
		
		User user = new User();
		t.commit();
		System.out.println("Successfully created users table");
		
		factory.close();
		session.close();
	}
	
	public void createUser() {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction t= session.beginTransaction();
		
		User uOne = new User ();
		uOne.setEmail("hasseb@gmail.com"); 
		uOne.setFullname ("Moh Haseeb"); 
		uOne.setPassword("has123");
		uOne.setSalary (2000.99);
		uOne.setAge (20) ;
		uOne.setCity ("NYC");
		
		User uTwo = new User();
		uTwo.setEmail("James@gmail.com");
		uTwo.setFullname (" James Santana");
		uTwo.setPassword(" James123");
		uTwo.setSalary (2060.69);
		uTwo.setAge (25);
		uTwo.setCity("Dallas");
		
		User uThree = new User();
		uThree.setEmail("");
		uThree.setFullname(null);
		uThree.setPassword(null);
		uThree.setSalary(0);
		uThree.setAge(5);
		uThree.setCity("Atlanta");
		
		User uFour= new User("Chris","chris@gmail.com","1234",35,35000.00,"Atlanta");
		
		User uFive= new User("Sid","sid@gmail.com","456",25,4000.00,"Louisville");
		
		session.persist(uOne);
		session.persist(uTwo);
		session.persist(uThree);
		session.persist(uFour);
		session.persist(uFive);
		
		t.commit();
		System.out.println("Succesfully saved");
		factory.close();
		session.close();
	}
	
	
	public void findUser(int id) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction t= session.beginTransaction();
		
		User u= session.get(User.class,id);
		System.out.println("Fullname: "+ u.getFullname());
		System.out.println("Email: "+u.getEmail());
		System.out.println("Salary: "+ u.getAge());
}
	
	public void updateUser () {
		SessionFactory factory = new Configuration().buildSessionFactory() ;
		Session session = factory.openSession ();
		Transaction t = session.beginTransaction ();
		User u = new User ();
		u.setId(3);
		u. setFullname("Lewis"); u.setEmail("Lewis@gmail.com");
		u. setPassword("1234");
		
		session.merge (u) ;
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
	
	public void deleteUser(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
	
		User u = new User();
	
		u.setId(id);
		session.remove (u);
		t.commit();
		session.close(); factory.close();
	}
	
}