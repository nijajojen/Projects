package String;

/*
 * Given a non-empty string and an int N,
 * return the string made starting with char 0, 
 * and then every Nth char of the string. 
 * So if N is 3, 
 * use char 0, 3, 6, ... and so on. 
 * N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
public class FindEveryNthLetter {

	public  String everyNth(String str, int n) {
		char letter=str.charAt(0);
		String newString= Character.toString(letter);
		
		for(int i=n;i< str.length(); i+=n)
		{
			letter= str.charAt(i);
			newString= newString + letter;
			
			
		}
		
		return newString; 
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FindEveryNthLetter newStringInst= new FindEveryNthLetter();
		newStringInst.everyNth("ab", 3);
	}

}
