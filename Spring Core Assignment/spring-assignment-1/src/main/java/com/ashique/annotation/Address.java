package com.ashique.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Basti Road")
	private String street;
	
	@Value("Maner")
	private String city;
	
	@Value("Bihar")
	private String state;
	
	@Value("801108")
	private String zip;
	
	@Value("India")
	private String country;
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
