package com.ashique.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ashique/streotype/stereo.xml");
		Student st= (Student) context.getBean("student",Student.class);
		System.out.println(st);
	}
}
