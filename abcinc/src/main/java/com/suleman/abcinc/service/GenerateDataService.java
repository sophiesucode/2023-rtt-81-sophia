package com.suleman.abcinc.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suleman.abcinc.model.Customer;
import com.suleman.abcinc.model.Order;

public class GenerateDataService {

	public void createData(){
		
		Session session =  HibernateService.getConnection();
		Transaction t = session.beginTransaction();
		
		
		
		
	//create customers
		
		Customer c1= new Customer();
		
		c1.setName("Mary Kay");
		c1.setEmail("Kay@gmail.com");
		c1.setPassword("1234");
		
		
		Customer c2= new Customer();
		
		c2.setName("Lisa Smith");
		c2.setEmail("Smith@gmail.com");
		c2.setPassword("1abgs");
		
		Customer c3= new Customer();
		
		c3.setName("Berry Lee");
		c3.setEmail("Lee@gmail.com");
		c3.setPassword("13rt");
		
		
		//creating Order
		
		Order o1= new Order();
		o1.setOrderDate("11-1-2023");
		o1.setProduct("Vacuum Cleaner");
		o1.setCust_id(1);
		
		
		Order o2= new Order();
		o2.setOrderDate("11-10-2023");
		o2.setProduct("Mop");
		o2.setCust_id(2);
		
		
		Order o3= new Order();
		o3.setOrderDate("11-1-2023");
		o3.setProduct("microfiber cloths");
		o3.setCust_id(3);
		
		
		
		Order o4= new Order();
		o4.setOrderDate("11-1-2023");
		o4.setProduct("All Purpose Cleaner");
		o4.setCust_id(3);
		
		
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		
		session.persist(o1);
		session.persist(o2);
		session.persist(o3);
		session.persist(o4);
		
		t.commit();	
		
	
		
		
	}
}
