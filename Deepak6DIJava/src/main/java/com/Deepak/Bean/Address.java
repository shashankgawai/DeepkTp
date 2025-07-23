package com.Deepak.Bean;

//By Using Constructor DI

public class Address {
	private String cityString;
	private int pincode;

	public Address(String cityString, int pincode) {
		super();
		this.cityString = cityString;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "cityString=" + cityString + ", pincode=" + pincode + "";
	}

}

//By Using Setter Methods In DI
//
//package com.Deepak.Bean;
//
//public class Address 
//{
//	private String cityString;
//	private int pincode;
//	public String getCityString() {
//		return cityString;
//	}
//	public void setCityString(String cityString) {
//		this.cityString = cityString;
//	}
//	public int getPincode() {
//		return pincode;
//	}
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//	@Override
//	public String toString() {
//		return "Address [cityString=" + cityString + ", pincode=" + pincode + "]";
//	}
//	
//}
