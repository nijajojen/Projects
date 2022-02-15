package String;

public class CheckPalindrome2 {

	public static boolean isPalindrome(String str) {
		int length= str.length();
		for(int i=0;i<(length/2);i++) {
			if(str.charAt(i)!= str.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String str= "aba";
		System.out.println(isPalindrome(str));

	}

}
