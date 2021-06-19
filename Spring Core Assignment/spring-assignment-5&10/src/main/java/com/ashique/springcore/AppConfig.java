package com.ashique.springcore;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ashique.springcore")
public class AppConfig {
	@Bean
	public Address address(){
		Address address = new Address();
		address.setCity("Patna");
		return address;
	}
	@Bean
	public Company company() {
		Company company = new Company();
		company.setCompName("Capgemini Ltd");
		return company;
	}
	@Bean
	public Id id() {
		Id id=new Id();
		return id;
	}
	
} 