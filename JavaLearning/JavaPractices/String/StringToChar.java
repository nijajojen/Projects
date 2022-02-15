package String;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Locale;


import org.junit.Assert;


public class StringToChar {

	public static void main(String[] args) {
		
		


		String s = "Welcome toI Baeldung!";
		//assertEquals("WELCOME TO BAELDUNG!", s.toUpperCase(Locale.US));
		
	/*	String s = "Welcome to Baeldung!";
		assertEquals("welcome to baeldung!", s.toLowerCase(Locale.UK));
		*/
System.out.println(s.toLowerCase(Locale.CANADA));		
		
		
		//System.out.println("Name = "+data[1]);
		//System.out.println("Address = "+data[2]); //Ne
		/*String str="Nija";
		char[] charArray= str.toCharArray();
		for(int i=0;i<str.length(); i++) {
			System.out.println(charArray[i]);
		}
		*/

	}

	

}
