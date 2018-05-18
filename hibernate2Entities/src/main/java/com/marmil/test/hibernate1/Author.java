package com.marmil.test.hibernate1;

import javax.persistence.Embeddable;

@Embeddable
public class Author {
	
	private String firstName;
	private String midName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName + "]";
	}
	

}
