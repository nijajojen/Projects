package String;

import java.util.Arrays;

public class FirstUniqueChar {
	
	 public static int firstUniqChar(String s) {
		 if(s.equals("")) {
			 return -1;
		 }
		 if(s.length()==1)
			 return 0;
		 s=s.toLowerCase();
		 System.out.println(s);
		 int length=s.length();
		 boolean repeats = false;
		 for(int i=0;i<length; i++) {
			 for(int j=0;j<length;j++) {
				if(s.charAt(i)== s.charAt(j) && i!=j)
				{
					repeats= true;
					break;
					
				}
				
			 }
			 if(repeats==false) {
				 System.out.println(i);
				 return i;
			 }
			 repeats=false;
			 
		 }
		return 0;
	        
	    }
	public static void main(String[] args) {
		String s="Nnijja";
		firstUniqChar(s);

	}

}
