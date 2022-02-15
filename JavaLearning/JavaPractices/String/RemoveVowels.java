package String;
/*
 * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' 
 * from it, 
 * and return the new string.
 */
public class RemoveVowels {
	
	public static String removeVowels(String S) {
		
		String newS = null;
		int length=S.length();
		for(int i=0;i<length; i++) {
			System.out.println(S.charAt(i));
			if((S.charAt(i)== 'a')||(S.charAt(i)== 'e')||(S.charAt(i)== 'i')||(S.charAt(i)== 'o')||S.charAt(i)== 'u') {
				System.out.println(S.charAt(i));
				S=S.substring(0, i) + S.substring(i+1, S.length()-1);
				i--;
			}
			
		}
		System.out.println(S);
		return S;
	        
	    }

	public static void main(String[] args) {
		
		removeVowels("Nijaa");
	}

}
