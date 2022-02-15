package classesandobjects;

import constructor.SubClass;

public class Test {

	public static void main(String[] args) {
		//SingletonEx singleObj= new Sing
		
		SingletonEx singleObj= SingletonEx.getInstance();
		SingletonEx singleObj2= SingletonEx.getInstance();
		System.out.println(singleObj== singleObj2);
	}

}
