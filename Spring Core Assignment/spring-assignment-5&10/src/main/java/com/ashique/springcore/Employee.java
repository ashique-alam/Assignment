package com.ashique.springcore;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import javax.inject.Inject;

@Component
public class Employee {
	@Resource
	private Company company;
	
	//@Resource
	@Inject
	private Address address;
	
	@Autowired
	private Id id;
	
	public Company getCompany() {
		return company;
	}
	public Address getAddress() {
		return address;
	}
	
	@Required
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	
	
	
} 