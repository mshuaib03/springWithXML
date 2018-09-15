package com.springpractice.springWithXML;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Difference Between AspectJ And Spring AOP
// https://www.baeldung.com/spring-aop-vs-aspectj
@Aspect
public class AopDemo {
	//@Before("execution(public void setId(String))")
	@Before("args(name)")
		public void beforeAdvice(String name){
		
		System.out.println("Before Advice ....");
	}
	@After("execution(public void setId(String))")
	public void AfterAdvice(){
		
		System.out.println("After Advice ....");
	}

	@AfterReturning("execution(public void setId(String))")
	public void AfterReturningAdvice(){
		
		System.out.println("AfterReturningAdvice ....");
	}
	
	@AfterThrowing("execution(public void displayInfo())")
	public void AfterThrowingAdvice(){
		
		System.out.println("AfterThrowingAdvice ....");
	}
	
	
}
