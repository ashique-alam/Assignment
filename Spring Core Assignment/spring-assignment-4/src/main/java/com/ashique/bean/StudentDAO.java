package com.ashique.bean;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	public Student createNewStudent() {
		Student student=new Student("Ashique",22);
		return student;
	}
}
