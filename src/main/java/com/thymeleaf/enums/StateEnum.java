package com.thymeleaf.enums;

public enum StateEnum {

	AL(1, "Alaska", "USA", "United State"),
	NY(2, "New York", "USA", "United State"),
	NJ(3, "New Jersey", "USA", "United State"),
	MY(4, "Miami", "CAN", "Canada");
	
	private int code;
	private String state;
	private String countryCode;
	private String country;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	StateEnum(int code, String state, String countryCode, String country){
		this.code = code;
		this.state = state;
		this.countryCode = countryCode;
		this.country = country;
	}
}
