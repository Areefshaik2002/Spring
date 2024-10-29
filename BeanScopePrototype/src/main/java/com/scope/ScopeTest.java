package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student)context.getBean("student");
		
		Faculty faculty = (Faculty)context.getBean("faculty");
		
		Worker worker = (Worker)context.getBean("worker");
		
		
		System.out.println(student.getAddress());
		
		System.out.println(faculty.getAddress());
		
		System.out.println(worker.getAddress());
	}

}
