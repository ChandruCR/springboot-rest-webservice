package com.got.entity;

import java.util.List;

public class GOTCharacter {
	
	private String firstName;
	private String lastName;
	private String house;
	private List<String> titles;
	public GOTCharacter() {
		super();
	}
	public GOTCharacter(String firstName, String lastName, String house, List<String> titles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.house = house;
		this.titles = titles;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public List<String> getTitles() {
		return titles;
	}
	public void setTitles(List<String> titles) {
		this.titles = titles;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
}
