package String;

import java.util.Arrays;

public class StringRotationCheck {

	static boolean isSubstring(String str1,String str2) {
		if(str1.length()!= str2.length())
			return false;
		char[] c1= str1.toCharArray();
		char[] c2= str2.toCharArray();
		
		boolean status=false;
		int length=str1.length();
		char prev=str1.charAt(str1.length()-1);
		for(int i=0;i<length;i++) {
			 
			for(int j=0;j<length;j++) {
				char fut= c1[j];
				c1[j]= prev;
				prev=fut;
													
			}
			
			
			if(Arrays.equals(c1, c2)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
	
		System.out.println(isSubstring("nija","jani"));
		
	}

}
