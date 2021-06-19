package com.ashique.springcore.assign10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("appContext")
	public ApplicationContextAwareExm getAppContext() {
		return new ApplicationContextAwareExm();
	}
	
	@Bean("testWork")
	public Work getWork() {
		return new Work();
	}
}
