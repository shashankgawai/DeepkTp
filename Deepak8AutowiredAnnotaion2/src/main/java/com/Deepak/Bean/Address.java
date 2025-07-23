package com.Deepak.Bean;

public class Address {
	private String cityString;
	private String stateString;
	private int pincode;

	public Address(String cityString, String stateString, int pincode) {
		super();
		this.cityString = cityString;
		this.stateString = stateString;
		this.pincode = pincode;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "[cityString=" + cityString + ", stateString=" + stateString + ", pincode=" + pincode + "]";
	}

}
