package com.Deepak.Bean;

import org.springframework.stereotype.Component;


public class Address
{
	@Override
	public String toString() {
		return "[areaString=" + areaString + ", cityString=" + cityString + ", stateString=" + stateString
				+ "]";
	}
	private String areaString;
	private String cityString;
	private String stateString;
	
	public String getAreaString() {
		return areaString;
	}
	public void setAreaString(String areaString) {
		this.areaString = areaString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public String getStateString() {
		return stateString;
	}
	public void setStateString(String stateString) {
		this.stateString = stateString;
	}
	
	

}
