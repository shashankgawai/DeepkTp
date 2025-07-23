package com.Deepak.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Deepak.Bean.Student;
import com.Deepak.Resources.ConfigueFile;

//#9 Autowiring in Spring Framework || XML Based Autowiring (autowire, byName, byType, constructor)

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/Deepak/Resources/ApplicationContext.xml");
		Student obStudent = (Student) context.getBean("std1");
		obStudent.Show();

	}
}
