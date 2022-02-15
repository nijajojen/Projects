package com.nija;

public class UnaryOperators {
	public static void main(String[] args) {
		int result=1;
		
		System.out.println(result);
		//postfix evaluates to the original values.
		System.out.println(result++);
		//prefix evaluates to the incremented value.
		System.out.println(++result);
		int[] arrayNum=  {1,2,3,4};
		for(int item: arrayNum) {
			System.out.println(item);
		}
		
	}

}



//DOUBTS
//what is equals and hash code.
//what is our jdk version
//what is the differe betw jdk and jre
//explain public static void main
//not understanding any of the codes in below link:
//https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html
//https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
//does we need to add main program inside other class or outside.is it required that outside class name should be the name ofile.
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
//study boxing and autoboxing