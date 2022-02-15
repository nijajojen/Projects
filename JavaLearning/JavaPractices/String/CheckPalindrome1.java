package String;

public class CheckPalindrome1 {

	public static boolean isPalindrome(String str) {
		if(str==null)
			return false;
		StringBuilder strBuildr= new StringBuilder(str);
		strBuildr.reverse();
		if(str.equals(strBuildr.toString())) {
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		

		String str= "aba";
		System.out.println(isPalindrome(str));

	}

}
