package classesandobjects;

import java.sql.Ref;

public class SingletonEx {
	
	private static SingletonEx refVar;
	
	private SingletonEx() {
		
	}
	
	public static SingletonEx getInstance()
	{
		if(refVar== null) {
			refVar= new SingletonEx();
			
			}
		return refVar;
	}
	
	public void printMe() {
		System.out.println("printed");
	}

}
