package com.spring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsTest {
	
	public static void main(String[] args){
	
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans-annotations.xml");
		
		
		
		ShapeTest test = (ShapeTest)context.getBean("shapeTest");
		
		test.claShapeArea();
	}

}
