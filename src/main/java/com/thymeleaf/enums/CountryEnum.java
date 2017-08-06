package com.thymeleaf.enums;

public enum CountryEnum {
	USA("USA", "United State"),
	CAN("CAN", "Canada");
	
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	CountryEnum(String code, String name){
		this.code=code;
		this.name= name;
	}
}
