package com.thymeleaf.model;

import java.util.List;

import com.thymeleaf.enums.StateEnum;

public class Person {

	private String firstName;
	private String middleName;
	private String lastName;
	private List<StateEnum> states;
	private StateEnum state;
	private String selectedState;
	private String country;
	
	
	public String getSelectedState() {
		return selectedState;
	}
	public void setSelectedState(String selectedState) {
		this.selectedState = selectedState;
	}
	public StateEnum getState() {
		return state;
	}
	public void setState(StateEnum state) {
		this.state = state;
	}
	public List<StateEnum> getStates() {
		return states;
	}
	public void setStates(List<StateEnum> states) {
		this.states = states;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
