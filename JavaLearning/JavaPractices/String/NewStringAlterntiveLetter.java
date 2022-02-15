package String;
/*
 * 
 */
public class NewStringAlterntiveLetter {
	public static String stringBits(String str) {
		String newOne="";
		int j=0;
		 for(int i=0; i<str.length();i++) {
			 if(j <str.length())
			 newOne+= str.charAt(j);
			 j+=2;
		 }
		 return newOne;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringBits("Hello"));
	}
}
