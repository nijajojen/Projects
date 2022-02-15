package classesandobjects;

import com.nija.OuterClass;

public class InnerClass  {

	static {
		System.out.println("I am in static block,inside inner class");
	}
	public void simplyPrint() {
		OuterClass outer = new OuterClass();
		System.out.println("simplyPrint() in Inner class");
	}
	

}
