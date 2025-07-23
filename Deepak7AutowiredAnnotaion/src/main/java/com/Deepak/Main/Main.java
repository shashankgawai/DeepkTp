package com.Deepak.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Deepak.Bean.Student;
import com.Deepak.Resources.ConfigueFile;

//#8 Autowiring in Spring Framework || @Autowired & @Qualifier Annotations with Programs Hindi


public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigueFile.class);
		Student obStudent = (Student)context.getBean("std1");
		obStudent.Show();
		
	}
}
