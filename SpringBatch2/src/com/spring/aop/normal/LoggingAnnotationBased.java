package com.spring.aop.normal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAnnotationBased {
	
	/** Following is the definition for a pointcut to select 
	  *  all the methods available. So advice will be called 
	  *  for all the methods. */ 
	@Pointcut("execution(* com.spring.aop.normal.SpringAOPService.*(..))")
	private void selectAll(){} 

	@Pointcut("execution(* com.spring.aop.normal.SpringAOPService.*(..))")
	private void selectAll1(){} 
	
	@Pointcut("execution(* com.spring.aop.normal.SpringAOPService.*(..))")
	private void selectAll2(){} 
	
	/**
	 * This is the method which I would like to execute 
	 *  before a selected method execution.
	 */
	//@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println(" ** @anotation based:: I am logging aspect and I am getting called before method execution. **");
	}

	/**
	 * * This is the method which I would like to execute * after a selected
	 * method execution.
	 */
	//@After("selectAll()")
	public void afterAdvice() {
		System.out.println(" ** I am logging aspect and I am getting called after the method execution. **");
	}
	
	/**
	 * * This is the method which I would like to execute * after a selected
	 * method execution.
	 */
	@Around("selectAll()")
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("This logger method is being called before method starts");
		joinPoint.proceed();
		System.out.println("This logger method called after method ends");
	}
	

	/**
	 * * This is the method which I would like to execute * when any method
	 * returns.
	 */
	//@AfterReturning(pointcut = "selectAll()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	/**
	 * * This is the method which I would like to execute * if there is an
	 * exception raised.
	 */
	//@AfterThrowing(pointcut="selectAll()", throwing="ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}

}
