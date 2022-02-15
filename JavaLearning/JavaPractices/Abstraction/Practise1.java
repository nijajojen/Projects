package Abstraction;

public class Practise1 {

	public static void main(String[] args) {
		 AbstractClass derivedObj= new DerivedClass();
		 derivedObj.callMe();

	}

}
abstract class AbstractClass{
	void callMe() {
		System.out.println("in abstract class");
	}
	abstract void demo();
}

class DerivedClass extends AbstractClass{
	 void demo() {
		System.out.println("in extended class,demo method");
	}
}
/*
Abstarct classes cannot be instantiated.
Then how can we access the method in the abstract class Ab.
The abstract class have to be extended and 
we can create the object using extended class 
thenn access super class method.

*/