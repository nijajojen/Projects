package classesandobjects;

import com.nija.OuterClass;

public class TestStaticBlock {

	public static void main(String[] args) {
		InnerClass innerObj=new InnerClass();
		System.out.println(innerObj);
		innerObj.simplyPrint();
		OuterClass outer = new OuterClass();
		//innerObj.simplyPrint();

	}

}
