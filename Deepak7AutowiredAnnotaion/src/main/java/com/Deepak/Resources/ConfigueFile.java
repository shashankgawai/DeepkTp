package com.Deepak.Resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Deepak.Bean.Address;
import com.Deepak.Bean.Student;
import com.Deepak.Bean.Subject;

@Configuration
public class ConfigueFile
{
	@Bean
	public Address add1()
	{
		Address address = new Address();
		address.setCityString("Akola");
		address.setStateString("Maharshtra");
		address.setPincode(41112);
		
		return address;
	}
	
	@Bean
	public Address add2()
	{
		Address address = new Address();
		address.setCityString("Mumbai");
		address.setStateString("Maharshtra");
		address.setPincode(421201);
		
		return address;
	}
	
	@Bean
	public Subject sub()
	{
		Subject obSubject = new Subject();
		
		List<String> subList = new ArrayList<String>();
		subList.add("Java");
		subList.add("C++");
		obSubject.setSubList(subList);
		
		return obSubject;
		
	}
	
	@Bean
	public Student std1()
	{
		Student student = new Student();
		student.setRoll(15);
		student.setNameString("Shashank");
		return student;
	}

}
