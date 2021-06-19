package com.ashique.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Ashique")
	private String studentName;
	
	@Value("Basti Road")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public String getCity() {
		return city;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
}
