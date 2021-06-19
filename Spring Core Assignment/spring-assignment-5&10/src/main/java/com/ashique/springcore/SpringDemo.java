package com.ashique.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args)  {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    Employee employee = ctx.getBean(Employee.class);
	    System.out.println(employee.getAddress().getCity());
	    System.out.println(employee.getCompany().getCompName());
	    System.out.println(employee.getId().getId());
    	ctx.close();
	}
}  