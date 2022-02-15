package String;

public class RemovalOfDuplicate {

	 public static String removeDuplicates(String S) {
		   int i = 0, n = S.length();
	        char[] res = S.toCharArray();
	        for (int j = 0; j < n; ++j, ++i) {
	            res[i] = res[j];
	            if (i > 0 && res[i - 1] == res[i]) // count = 2
	                i -= 2;
	        }
	        return new String(res, 0, i);
	        
	    }
	private static String removeCharAt(String s, int i) {
		
		return s.substring(0, i) + s.substring(i+2);
		
	}
	public static void main(String[] args) {
		removeDuplicates("aa");

	}

}
