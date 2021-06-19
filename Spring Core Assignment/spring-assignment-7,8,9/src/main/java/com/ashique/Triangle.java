package com.ashique;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
	
	private List<Point> points;
	private ApplicationContext context=null;
	

	public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
	}

	
	public void draw() {
		for(Point point:points) {
			System.out.println("Point = ("+point.getX()+","+point.getY()+")");
		}
	
	}




	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}




	public void setBeanName(String name) {
		System.out.println("Bean Name = "+name);
		
	}
	
	public void myInit() {
		System.out.println("My init method called for triangle");
	}
	
	public void cleanUp() {
		System.out.println("My destroy method called for triangle");
	}




	public void destroy() throws Exception {
		System.out.println("InitializingBean init method called from triangle");
		
	}




	public void afterPropertiesSet() throws Exception {
		System.out.println("DisposableBean destroy method called from triangle");
		
	}
}
