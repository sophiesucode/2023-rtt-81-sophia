package com.suleman.abcinc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Order implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer id;
	private String orderDate;
	private String product;
	private int cust_id;



public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




@ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
@JoinColumn(name = "cust_id", insertable = false, updatable = false)
private Customer customer;


public Order() {
	
}

public Order(String orderDate, String product) {
	super();
	this.orderDate = orderDate;
	this.product = product;
}



public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}

@Override
public String toString() {
	return "Order [id=" + id + ", orderDate=" + orderDate + ", product=" + product + "]";
}




}
