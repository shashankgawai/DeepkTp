package org.example.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 

{
	@Autowired
	private Address add1;

	@Value("111")
	private int roll;
	@Value("Shashank")
	private String nameString;
	@Value("Sha@gmail.com")
	private String emaiString;

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

	public String getEmaiString() {
		return emaiString;
	}

	public void setEmaiString(String emaiString) {
		this.emaiString = emaiString;
	}

	public void Display() {
		System.out.println("Roll : " + roll);
		System.out.println("Name : " + nameString);
		System.out.println("Email : " + emaiString);
		add1.Add();
	}

}
