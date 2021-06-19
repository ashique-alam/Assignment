package com.ashique.propertyAnnot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		 AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
	        FileService service = (FileService) context.getBean("fileService");
	         
	        service.readValues();
	        context.close();

	}

}
