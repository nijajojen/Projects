package String;
/*
 * Given a string,
 *  take the last char and
 *   return a new string with the last char added at the front and back,
 *    so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
public class AddLetterFrontBack {

	int index;
	char letter;
	String newString;
	public String backAround(String str) {
		 index= str.length()-1;
		 letter= str.charAt(index);
		 newString= letter+str+letter;
		 
		  
		return newString;
	}
	
	public static void main(String[] args) {
		AddLetterFrontBack insta= new AddLetterFrontBack();
		System.out.println(insta.backAround("Alfie"));

	}

}
