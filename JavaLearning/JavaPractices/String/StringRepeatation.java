package String;
/*
 * Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
public class StringRepeatation {
	
	public static String stringSplosion(String str) {
		String newPattern="";
		for(int i=0; i< str.length(); i++)
		{
			
				newPattern+=str.substring(0,i+1);
			
		}
		return newPattern;
	}
	
	public static void main(String[] args) {
		
		System.out.println(stringSplosion("ab"));

	}

}
