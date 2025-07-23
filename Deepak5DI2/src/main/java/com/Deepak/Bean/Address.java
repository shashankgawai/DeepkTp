package com.Deepak.Bean;

import org.springframework.stereotype.Component;


public class Address
{
	
	private String areaString;
	private String cityString;
	private String stateString;
	
	@Override
	public String toString() {
		return "Address [areaString=" + areaString + ", cityString=" + cityString + ", stateString=" + stateString
				+ "]";
	}

	public Address(String areaString, String cityString, String stateString) {
		super();
		this.areaString = areaString;
		this.cityString = cityString;
		this.stateString = stateString;
	}
	
	
	
	

}
