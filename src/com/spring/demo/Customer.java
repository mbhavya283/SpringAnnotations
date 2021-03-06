package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private int custID; 
	private String customerName; 
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public Customer() {
		super();
	}

	public Customer(Address address) {
		super();
		this.address = address;
		System.out.println("Invoked via constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Invoked via Setter");

	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
