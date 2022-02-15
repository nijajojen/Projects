package String;

/*
 * Given a string,
 *  return a new string where the last 3 chars are now in upper case.
 *   If the string has less than 3 chars,
 *   uppercase whatever is there. 
 *   Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class FindLast3Chars {

	public static String endUp(String str) {
		
		int length= str.length();
		if(length<=3) {
			return(str.toUpperCase());
		}
		else {
			
			return str.substring(0,length-3)+str.substring(length-3, length).toUpperCase();
			
				
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		endUp("hi there");
	}

}
