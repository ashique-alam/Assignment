package com.ashique.lifecycleannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashique.annotation.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext appContext = 
				new AnnotationConfigApplicationContext(com.ashique.lifecycleannot.AppConfig.class);
		
		appContext.registerShutdownHook();

		Question question= appContext.getBean("getQuestion",Question.class);
		System.out.println(question);
	}

}
