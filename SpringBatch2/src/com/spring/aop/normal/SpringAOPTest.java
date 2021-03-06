package com.spring.aop.normal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAOPTest {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-aop.xml");

		SpringAOPService service = (SpringAOPService) applicationContext.getBean("aoptest.service");

		try {
			service.startProcess();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//applicationContext.registerShutdownHook();
	}
}