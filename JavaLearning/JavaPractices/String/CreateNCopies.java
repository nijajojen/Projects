package String;
/*
 * Given a string and a non-negative int n, 
 * return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

 */
public class CreateNCopies {

	public static String stringTimes(String str, int n) {
		String nCopy="";
		 String addString= str;
		 for(int i=0;i<=n-1; i++) {
			 nCopy+= addString;
		 }
		 return nCopy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringTimes("Oh Boy!", 2));
	}

}
