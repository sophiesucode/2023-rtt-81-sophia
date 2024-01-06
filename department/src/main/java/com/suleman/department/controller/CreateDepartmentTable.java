package com.suleman.department.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suleman.department.model.Department;

public class CreateDepartmentTable {
public static void main(String[] args) {


		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction t= session.beginTransaction();
		
		Department departmentone = new Department();
		t.commit();
		System.out.println("Successfully created department table");
		
		factory.close();
		session.close();
	}
	


}
