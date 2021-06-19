package com.ashique.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context= new ClassPathXmlApplicationContext("com/ashique/annotation/annotationConfig.xml");
		Customer customer= (Customer) context.getBean("customer");
		customer.printDetail();
	}

}
