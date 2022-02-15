package com.nija;

public class OuterClass {

	static {
		System.out.println("I am in static block,inside outer class");
	}
	public void simplyPrint() {
		System.out.println("simplyPrint() in OuterClass");
	}

}
