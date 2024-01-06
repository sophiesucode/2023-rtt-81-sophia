package com.suleman.customerdao.customerinterface;

import java.util.List;

import com.suleman.customerdao.model.Customer;

public interface CustomerDao {
	List<Customer>getAllCustomers();
	
	Customer getCustomerById(int id);
	
	Customer addCustomer(Customer c);
	
	Customer removeCustomerById(int id);
	
	
	
}
