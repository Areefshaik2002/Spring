package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		
		Student student1 = (Student)context.getBean("student1");
		
		System.out.println(student1);
		
		
		
	}
}
