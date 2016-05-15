package com.spring.inheritence;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringSampleApplicationContextTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans-inheritence.xml");
		
		
		
		Student student1 = (Student)context.getBean("student");
		
		Student student2 = (Student)context.getBean("student");
		
		System.out.println(student1);

		
		
	}

}
