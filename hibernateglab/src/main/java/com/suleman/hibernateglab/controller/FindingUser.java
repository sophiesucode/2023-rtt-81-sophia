package com.suleman.hibernateglab.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suleman.hibernateglab.model.User;

public class FindingUser {

	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session= factory.openSession();
	
	Transaction t= session.beginTransaction();
	
	
	
	public void findUser(int id) {
		
		User u=session.get(User.class, id);
		System.out.println("Fullname: "+ u.getFullname());
		System.out.println("Email: "+u.getEmail());
		System.out.println("Salary: "+ u.getSalary());
		
	
	}
}
