package com.suleman.hibernateglab.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suleman.hibernateglab.model.User;

public class DeletingUser {
public static void main(String[] args) {
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t= session.beginTransaction();
	
	
	User u = new User();
	u.setId(3);
	session.remove(u);
	  t.commit();
	    session.close();
	    factory.close();
}
	
}
