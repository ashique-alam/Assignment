package com.ashique.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Customer customer= (Customer) context.getBean("customer");
		customer.printDetail();
	}

}
