package com.spring.inject.datatypes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringSampleApplicationContextTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans-inject_datatypes.xml");
		
		
		
		Student student1 = (Student)context.getBean("student");
		
		Student student2 = (Student)context.getBean("student");
		
		Address address1 = (Address)context.getBean("student.address");
		
		Address address2 = (Address)context.getBean("student.address");
		
		
		System.out.println(student1);
		
		
		context.registerShutdownHook();
		
	}

}
