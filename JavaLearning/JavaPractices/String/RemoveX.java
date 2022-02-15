package String;
/*
 * Given a string, 
 * return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public class RemoveX {
	public static String stringX(String str) {
		int len= str.length();
		char first= str.charAt(0);
		char last= str.charAt(len-1);
		String sub=str.substring(1, len-1);
		return first +sub.replace("x", "") +last ;
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringX("xxHxix"));
	}

}
