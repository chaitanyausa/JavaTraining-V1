package com.spring.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByNameTest {
	
	public static void main(String[] args){
	
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans-autowire.xml");
		
		
		
		ShapeTest test = (ShapeTest)context.getBean("shapeTest");
		
		test.claShapeArea();
	}

}
