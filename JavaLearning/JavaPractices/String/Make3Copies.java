package String;
/*
 * Given a string, 
 * we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, 
 * the front is whatever is there. 
 * Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */
public class Make3Copies {

	public static String front3(String str) {
		if(str.length()>=1 && str.length()<=2 ) {
			return str+""+str+""+str;
		}
	else if(str.length()>=3) {
			  String newVal= str.substring(0,3);
			  return newVal+""+newVal+""+ newVal;
					  
		  }
		  else {
			  return str;
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(front3("java"));
	}

}
