package com.spring.jsr250annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * We will see annotations like postConstructor, preDestroy, Resource 
 * *
 */
public class AnnotationsTest {
	
	public static void main(String[] args){
	
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans-jsr250-annotations.xml");
		
		
		
		ShapeTest test = (ShapeTest)context.getBean("shapeTest");
		
		test.claShapeArea();
		
		context.registerShutdownHook();
	}

}
