package com.spring.singletonpatern;

public class SingletonTest {
	
	public static void main(String[] args){
		
		StudentSingle studentSingle1=null, studentSingle2=null;
		
		studentSingle1 = StudentSingle.getBean();
		
		studentSingle2 = StudentSingle.getBean();
		
	}

}
