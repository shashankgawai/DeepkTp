package org.example.Main;

import org.example.Bean.Student;
import org.example.Resources.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//	Student obStudent = (Student)context.getBean("student");
//	obStudent.Display();
		
	String pathString = "org/example/Resources/ApplicationContext.xml";	
	ApplicationContext context = new ClassPathXmlApplicationContext(pathString);
	
	Student obStudent = (Student)context.getBean("student");
	obStudent.Display();
	
	
	
	
	
		
	}
}
