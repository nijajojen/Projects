package overriding;
/*
 * If static methods are redefined in the derived class, 
 * it is not overridden but it hides the superclass method.
 */
public class StaticOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b= new Derived();
		b.display();
		Base ba= new Derived();
		ba.print();
	}

}
class Base{
	public static void display() {
		System.out.println("static or class method from base class");
	}
	public void print() {
		System.out.println("Non static or instance method from base class ");
	}
}
class Derived extends Base{
	public static void display() {
		System.out.println("static from derived.This method hides the base class");
	}
	public void print() {
		System.out.println("Non static or instance method from derived class ");
	}
}
