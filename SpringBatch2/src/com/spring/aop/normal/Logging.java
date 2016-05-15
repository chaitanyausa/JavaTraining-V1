package com.spring.aop.normal;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {

	/**
	 * * This is the method which I would like to execute * before a selected
	 * method execution.
	 */
	public void beforeAdvice() {
		System.out.println(" ** I am logging aspect and I am getting called before method execution. **");
	}

	/**
	 * * This is the method which I would like to execute * after a selected
	 * method execution.
	 */
	public void afterAdvice() {
		System.out.println(" ** I am logging aspect and I am getting called after the method execution. **");
	}
	
	/**
	 * * This is the method which I would like to execute * after a selected
	 * method execution.
	 */
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("This logger method is being called before method starts");
		joinPoint.proceed();	
		System.out.println("This logger method called after method starts");
	}
	

	/**
	 * * This is the method which I would like to execute * when any method
	 * returns.
	*/
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Printing the value which is returned from method:" + retVal.toString());
	} 
	/**
	 * * This is the method which I would like to execute * if there is an
	 * exception raised.
	 */
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}

}
