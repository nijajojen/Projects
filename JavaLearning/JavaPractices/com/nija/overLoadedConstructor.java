package com.nija;

public class overLoadedConstructor {
	int num;
	int sum;
	overLoadedConstructor(int numVal){
		num =numVal;
	}
	
	overLoadedConstructor(int val1, int val2){
		sum= val1+ val2;
	}
	
}
