package com.ashique;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static AbstractApplicationContext context;
	
	public static void main(String []args) {
		context=new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		
		Triangle triangle= (Triangle) context.getBean("triangle1");
		
		triangle.draw();
	}

}
