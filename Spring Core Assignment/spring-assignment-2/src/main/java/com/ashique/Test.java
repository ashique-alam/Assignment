package com.ashique;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("spring.xml");
	Question question= (Question) context.getBean("question");
	question.printQuestionAnswer();

	}

}
