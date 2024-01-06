package com.suleman.theschool.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Person implements Serializable {
private static long serialVersionUID=1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int personId;
private String name;
private String email;
private int age;


public Person() {
	
}

@OneToOne(cascade=CascadeType.ALL)
private Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Person(int personId, String name, String email, int age) {
	super();
	this.personId = personId;
	this.name = name;
	this.email = email;
	this.age = age;
}
public Person(String name, String email, int age) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
}
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", name=" + name + ", email=" + email + ", age=" + age + "]";
}







}
