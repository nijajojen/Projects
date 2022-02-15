package com.nija;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> genObj=  new Generic("ABC");
		System.out.println( genObj.getVar().getClass().getTypeName());		
	}

}
