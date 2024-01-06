package com.suleman.theschool.model;

import java.io.Serializable;

public class Address implements Serializable//coverts bits into texts and texts into bits
{
private static final long serialVersionUID=1L;

private int addressId;
private String street;
private String city;
private String state;
private int zipcode;

public Address() {}

public Address(String street, String city, String state, int zipcode) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}

public int getAddressId() {
	return addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getZipcode() {
	return zipcode;
}

public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}

@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
			+ ", zipcode=" + zipcode + "]";
}



}
