package com.Deepak.Main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Deepak.Bean.Student;
import com.Deepak.Resources.ApplicationJAvaConext;

//Setter Method DI & Constructor DI using Java Configuration

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationJAvaConext.class);
		Student student = (Student) context.getBean("stud1");
		student.display();

	}

}
