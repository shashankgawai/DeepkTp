package com.Deepak.Main;

//Setter Method DI using XML Configuration

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Deepak.Bean.Student;

public class Main 
{
	public static void main(String[] args) {
		
		String configString="com/Deepak/Resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configString);
		Student obStudent = (Student) context.getBean("std");
		obStudent.display();
		
//		Student obStudent2 = (Student) context.getBean("std1");
//		obStudent2.display();
		
		
	}

}
