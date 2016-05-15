package com.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSampleApplicationContextTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-sample.xml");

		Student student = (Student) context.getBean("student");
			System.out.println(student);
	}

}
