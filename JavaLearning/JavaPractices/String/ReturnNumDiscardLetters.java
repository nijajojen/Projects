package String;

import java.util.regex.Pattern;

public class ReturnNumDiscardLetters {

	 
	 
	 public static int myAtoi(String str) {
		 int sign = 1, i = 0, r = 0;
	        str = str.trim();
	        if (str.isEmpty())
	        	return 0;
	        else if (str.charAt(i) == '-')
	        	{
	        	i++;
	        	sign = -1;
	        	}
	        else if (str.charAt(i) == '+')
	        	{ 
	        	i++; 
	        	}
	        while (i < str.length() && Character.isDigit(str.charAt(i))) {
	            int d = str.charAt(i) - '0';	
	            long dd=(long)r;
	            if (dd> (Integer.MAX_VALUE ))
	            	return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            r = r * 10 + d;
	            i++;
	            
	        }
	        return r * sign;
		 		
	}
	
	public static void main(String[] args) {
		/*int intVal=65;    
		char c=(char)intVal;    
		System.out.println(c);  */
		System.out.println(myAtoi("-9128347233 "));

	}

}
