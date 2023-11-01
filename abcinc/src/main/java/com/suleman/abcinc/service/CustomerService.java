package com.suleman.abcinc.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.suleman.abcinc.daointerface.CustomerDao;
import com.suleman.abcinc.daointerface.OrderDao;
import com.suleman.abcinc.model.Customer;
import com.suleman.abcinc.model.Order;

public class CustomerService implements CustomerDao, OrderDao {

	
	
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		 Session session = HibernateService.getConnection(); // Getting the Hibernate session from hibernate service

	     
	            // get all customers
	            TypedQuery<Customer> query = session.createQuery("from Customer", Customer.class);

	            // Executing query to get the list of customers
	            List<Customer> customers = query.getResultList();

	            session.close();
	            return customers;
	   
	           
	  
	    }
	
	
	

	
	
	
	
	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
