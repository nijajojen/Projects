package overriding;

public class Animal {
	public void move() {
		System.out.println("Animals can move");
	}

	public void bark() {
		System.out.println("now dog is barking");
	}
}
class Dog extends Animal {
	   public void move() {

	      System.out.println("Dogs can walk and run");
	   }
	   public void bark() {
		   System.out.println("Dogs can bark");
	   }
	}
