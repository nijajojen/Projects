package String;
/*
 * Given a string and a non-negative int n, 
 * we'll say that the front of the string is the first 3 chars, 
 * or whatever is there if the string is less than length 3. 
 * Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

 */
public class Repeat3LettersNtimes {

	public static String frontTimes(String str, int n) {
		String orgString="";
		int frontLength=3;
		if(frontLength> str.length())
			frontLength= str.length();
		
		String front= str.substring(0,frontLength);
		
		for(int i=1;i<=n;i++) {
			orgString+= front;
		}
		
		return orgString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontTimes("", 3));
	}

}
