package com.OOPlvl2Inheritance;

public class Person extends Object {

	private String name;
	private String email;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		//return getClass().getName() + "#" + Integer.toHexString(hashCode());
		return name + "#" + email + "#" + phoneNumber;
	}
	
	
}
