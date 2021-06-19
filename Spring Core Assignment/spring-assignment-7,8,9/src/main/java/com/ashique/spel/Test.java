package com.ashique.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ashique/spel/spel.xml");
		Demo d1= (Demo) context.getBean("ob");
		System.out.println(d1);

	}

}
