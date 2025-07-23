package com.Deepak.Bean;

public class Student 
{
	private int rollno;
	private String nameString;
	private String emailString;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	
	public void display()
	{
		System.out.println("RollNo " + rollno);
		System.out.println("Name " + nameString);
		System.out.println("Email "+ emailString);
	}

}
