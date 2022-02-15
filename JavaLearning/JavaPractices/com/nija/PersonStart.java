package com.nija;

public class PersonStart {

	public static void main(String[] args) {
		Person p= new Person();
		
		Teacher t= new Teacher();
		p.setDetails("Nija", 30, "San Jose");
		t.setDetails("Teacher", "Java", 20000);
		System.out.println(t);
	}

}
