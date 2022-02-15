package com.nija;

public class Human implements LivingBeing{

	String hairteture;
	String sex;
	String height;

	public void walking(String value) {
		String walkingStyle = value;
		System.out.println(walkingStyle);
		int noOfLegs=1;
		System.out.println(noOfLegs);

	}

	public void dancing(boolean value) {
		boolean status = value;
	}
	public static void main(String[] args) {

		Human nija = new Human();
		nija.walking("normal");
		nija.dancing(true);
		System.out.println(nija.hairteture);
		
	}

	
}

