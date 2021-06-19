package com.ashique.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	public Student createNewStudent() {
		return studentService.createNewStudent();
	}
}
