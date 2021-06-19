package com.ashique.springcore.assign10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareExm implements ApplicationContextAware{
	
	ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
		
	}

}
