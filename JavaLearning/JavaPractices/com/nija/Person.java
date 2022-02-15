package com.nija;

public class Person {
static String name;
static int age;
static String address;

public void setDetails(String name, int age, String address) {
	this.name= name;
	this.age= age;
	this.address= address;
}


public void basicDetails() {
	System.out.println("name: "+ name);
	System.out.println("age: "+ age);
	System.out.println("address: "+ address );
}
	
}
