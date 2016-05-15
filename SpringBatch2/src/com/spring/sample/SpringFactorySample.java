package com.spring.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringFactorySample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("D:/Work/WorkspacePersonal/SpringBatch2/resources/spring-beans-sample.xml"));
						
		Student student = (Student)beanFactory.getBean("std");
		System.out.println(student);

	}

}
