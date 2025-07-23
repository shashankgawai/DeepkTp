package com.Deepak.Resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Deepak.Bean.Address;
import com.Deepak.Bean.Student;

@Configuration
public class ApplicationJAvaConext {
	@Bean
	public Address add1() {
		Address Add = new Address("Kalyan", 241201);

		return Add;
	}

	@Bean
	public Student stud1() {
		Student student = new Student(1117, "Ankush", "Ankush@gmail.com", add1());

		return student;
	}

}

//	By Using Setter Methods

//	@Bean
//	public Address add1()
//	{
//		Address address = new Address();
//		address.setPincode(421201);
//		address.setCityString("Dombivli");
//		
//		return address;
//		
//	}
//		
//	@Bean
//	public Student creteStudent()
//	{
//		Student std1 = new Student();
//		std1.setRollno(121);
//		std1.setNameString("Kamal");
//		std1.setEmailString("Helo@gmail.com");
//		std1.setAddress(add1());
//		
//		return std1;
//	}
