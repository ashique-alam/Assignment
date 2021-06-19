package com.ashique.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		QuestionService service = appContext.getBean("questionService",QuestionService.class);
		
		System.out.println(service.findAll().getQuestion());
		System.out.println(service.findAll().getQuestionId());
		System.out.println(service.findAll().getAnswer());

	}

}
