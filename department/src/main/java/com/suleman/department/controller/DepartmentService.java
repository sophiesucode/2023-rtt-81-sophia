package com.suleman.department.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suleman.department.model.Department;



public class DepartmentService {

	public void createDepartment(Department department ) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction t= session.beginTransaction();
		
		 session.persist(department);
//		Department deptone = new Department();
//		deptone.setName("Marketing");
//		deptone.setState("Virgina");
//		
//		
//		Department depttwo= new Department();
//		depttwo.setName("Sales");
//		depttwo.setState("Georgia");
//		
//		Department deptthreee= new Department();
//		depttwo.setName("Engineering");
//		depttwo.setState("California");
//		
//		Department deptfour= new Department();
//		depttwo.setName("Education");
//		depttwo.setState("California");
//		
//		session.persist(deptone);
//		session.persist(depttwo);
//		session.persist(deptthreee);
//		session.persist(deptfour);
		
		t.commit();
		factory.close();
		session.close();
	}
	
	public void updateDepartment() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Department deptone = new Department();
		
		deptone.setId(1);
		deptone.setName("Legal");
		deptone.setState("NewYork");
		
		session.merge(deptone);
	    session.getTransaction().commit();
	    session.close();

	}
	
//	public List<Department> getAllDepartments() {
//	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
//	    Session session = factory.openSession();
//	    Transaction t = session.beginTransaction();
//
//	    Criteria criteria = session.createCriteria(Department.class);
//	    List<Department> departments = criteria.list();
//
//	    t.commit();
//	    session.close();
//	    factory.close();
//
//	    return departments;
//	}
		
		
	
	public void findDepartment(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Department deptone= session.get(Department.class,id);
		System.out.println("name: " + deptone.getName());
	    System.out.println("state: " + deptone.getState());
	  



		
	}
	

		public void deleteDepartment(int id) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
		
			Department deptone = new Department();
		
			deptone.setId(id);
			session.remove (deptone);
			t.commit();
			session.close(); 
			factory.close();
		}
		
	}

