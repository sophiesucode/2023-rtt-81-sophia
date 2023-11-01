package com.suleman.abcinc.daointerface;

import java.util.List;

import com.suleman.abcinc.model.Customer;

public interface CustomerDao {

	List<Customer> getAllCustomers();
	
	Customer getCustomerByEmail(String email);
	
	List<Customer> getCustomerOrders();
}
