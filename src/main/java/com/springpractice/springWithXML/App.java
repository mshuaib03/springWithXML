package com.springpractice.springWithXML;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws Exception {  
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Student student= (Student)context.getBean("studentbean");
	    student.setId("rt");
	    student.displayInfo(); 
		    
	}  
}
