package com.ashique.annotationset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashique.annotation.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(com.ashique.annotationset.AppConfig.class);

		Question question= appContext.getBean("getQuestion",Question.class);
		System.out.println(question);
	}

}
