package Integer;
import java.lang.*;;
/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Input: 123
 * Output: 321
*/
public class ReverseInteger {

	/*
	 * Converted Integer to String array. Integer.toString(x)).split("")
	 * Done String Reversal - Using normal for loop
	 * Converted reversed string to integer.  Integer.parseInt(str);
	 */
	    public static int reverse(int x) {
	    	String[] digits= (Integer.toString(x)).split("");
	    	String str = "";
	    	Integer newInt;
	    	for(int i=digits.length-1; i>=0; i--) {
	    		str= str +(digits[i]);
	    	}
	    	newInt= Integer.parseInt(str);
			return newInt;
	        
	    }
	    
	    public static int anotheReverse(int x) {
	        int rev=0;
	         while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	          
	            rev = rev * 10 + pop;
	            if(rev >=(Math.pow(2,31)-1)) {
	            	return 0;
	            }
	        }
	        return rev;
	    
	    }
	
	
	public static void main(String[] args) {
		//System.out.println(reverse(
		//		1534236469));
		
		System.out.println(anotheReverse(

				1534236469));

	}

	
	

}
