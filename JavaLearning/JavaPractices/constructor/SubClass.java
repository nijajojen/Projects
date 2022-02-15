package constructor;

public class SubClass extends CanWeInstantiate{
/*
 * first line of a subclass construtor should be always a call
 * to super() ,super class constructor.
 */
	public SubClass() {
		super(2);
		System.out.println("subclass constructor");
	}
	public static void method() {
		System.out.println("in SubClass");
	}
	


}
