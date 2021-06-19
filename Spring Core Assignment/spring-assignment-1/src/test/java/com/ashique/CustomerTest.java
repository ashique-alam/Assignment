package com.ashique;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

public class CustomerTest {
	
	private Customer customer;
	private static ApplicationContext context;

	@Test
	public void testPrintDetail() {
		context= new ClassPathXmlApplicationContext("spring.xml");
		customer=(Customer) context.getBean("customer");
		
		Assert.assertEquals("Ashique",customer.getCustomerName());
		
	}

}
