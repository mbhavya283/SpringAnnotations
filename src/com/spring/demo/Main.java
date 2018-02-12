package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String arg[]){
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 
		 Customer customer = (Customer) context.getBean("customer");
		 
		 System.out.println("Customer ID: "+customer.getCustID());
		 System.out.println("Customer Name: "+customer.getCustomerName());
		 System.out.println("Customer Addr1: "+customer.getAddress().getAddressLine1());
		 System.out.println("Customer Addr2: "+customer.getAddress().getAddressLine2());
		 System.out.println("Customer City: "+customer.getAddress().getCity());

		 Address address = (Address) context.getBean("address");
		 System.out.println("Addr1: "+address.getAddressLine1());
		 System.out.println("Addr2: "+address.getAddressLine2());
		 System.out.println("City: "+address.getCity());

	}

}
