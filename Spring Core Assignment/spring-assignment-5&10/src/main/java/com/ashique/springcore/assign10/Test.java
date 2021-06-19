package com.ashique.springcore.assign10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContextAwareExm appcontext= (ApplicationContextAwareExm)context.getBean("appContext");
		ApplicationContext appCon =appcontext.getContext();
		Work work= (Work)appCon.getBean("testWork");
		work.doWork();
		context.registerShutdownHook();

	}

}
