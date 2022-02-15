package String;

public class ReverseRecursion {
	
	public static void helper(char[] s, int left, int right) {
	    if (left >= right) return;
	    char tmp = s[left];
	    s[left++] = s[right];
	    s[right--] = tmp;
	    helper(s, left, right);
	  }
	
	 public static void reverseString(char[] s) {
		    helper(s, 0, s.length - 1);
		  }
	 
	public static void main(String[] args) {
		char[] array= {'n','i','j','a'};
		reverseString(array);

	}

}
