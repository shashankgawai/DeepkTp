package com.Deepak.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int roll;
	private String nameString;
	private Address address;
	private Subject subject;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Student(int roll, String nameString, Address address, Subject subject) {
		super();
		this.roll = roll;
		this.nameString = nameString;
		this.address = address;
		this.subject = subject;
	}

	public void Show() {
		System.out.println("Roll : " + roll);
		System.out.println("Name : " + nameString);
		System.out.println("Address : " + address);
		System.out.println("Subject : " + subject);

	}

}
