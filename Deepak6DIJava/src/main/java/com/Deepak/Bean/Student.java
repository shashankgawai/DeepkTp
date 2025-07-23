package com.Deepak.Bean;

import java.lang.foreign.AddressLayout;

import org.springframework.beans.factory.annotation.Autowired;

//By Using Constructor DI

public class Student {
	private int rollno;
	private String nameString;
	private String emailString;
	private Address Address;

	public Student(int rollno, String nameString, String emailString, com.Deepak.Bean.Address address) {
		super();
		this.rollno = rollno;
		this.nameString = nameString;
		this.emailString = emailString;
		Address = address;
	}

	public void display() {
		System.out.println("RollNo : " + rollno);
		System.out.println("Name : " + nameString);
		System.out.println("Email : " + emailString);
		System.out.println("Adrress : " + Address);
	}

}

//By USing Setter Method DI

//package com.Deepak.Bean;
//
//import java.lang.foreign.AddressLayout;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class Student {
//	private int rollno;
//	private String nameString;
//	private String emailString;
//	private Address Address;
//
//	public int getRollno() {
//		return rollno;
//	}
//
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//
//	public String getNameString() {
//		return nameString;
//	}
//
//	public void setNameString(String nameString) {
//		this.nameString = nameString;
//	}
//
//	public String getEmailString() {
//		return emailString;
//	}
//
//	public void setEmailString(String emailString) {
//		this.emailString = emailString;
//	}
//
//	public Address getAddress() {
//		return Address;
//	}
//
//	public void setAddress(Address address) {
//		Address = address;
//	}
//
//	public void display() {
//		System.out.println("RollNo " + rollno);
//		System.out.println("Name " + nameString);
//		System.out.println("Email " + emailString);
//		System.out.println("Adrress " + Address);
//	}
//
//}
