package com.nija.base;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	Person(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	Person(String firstName) {
		
	}
	
	Person(){
		
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}

	public boolean equals(Person p) {
		return this.firstName.equals(p.firstName);
	}
}
