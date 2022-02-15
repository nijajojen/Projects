package array;
/*
 * Given 2 strings, a and b, 
 * return the number of the positions where they contain 
 * the same length 2 substring. 
 * So "xxcaazz" and "xxbaaz" yields 3, 
 * since the "xx", "aa", and "az" substrings appear 
 * in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0

 */
public class CountMatchingSubStringInSameIndex {

	public static int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		  int count = 0;
		for(int i=0; i <len-1; i++) {
			
			System.out.println(a.substring(i,i+2));
			System.out.println(b.substring(i,i+2)+'\n');
			if((a.substring(i,i+2).equals(b.substring(i,i+2))) ){
				count++;
			}
		}
		return count;
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringMatch("abc", "abc"));
	}

}
