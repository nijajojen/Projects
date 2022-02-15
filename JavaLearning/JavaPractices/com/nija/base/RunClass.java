package com.nija.base;

public class RunClass {

	public static void main(String[] args) {

		Person p1 = new Person("Nija", "Jojen");
		Person p2 = new Person("Nija", "Binoy");
		System.out.println(p1.equals(p2));
		//System.out.println(p1.toString()	);
	}

}
