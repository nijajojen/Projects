package String;

public class GreatestCommonDivisor {

	 public static String gcdOfStrings(String str1, String str2) {
		
		 String sub ="";
		 for(int i=1;i<str2.length();i++) {
			 System.out.println(str2.length());
			if( str1.indexOf(str2.substring(0, i))>=0) {
				
				sub=str2.substring(0, i+1);
				System.out.println(str2.substring(0, i));
					if(i+1<str2.length()-1) {
					if(sub.charAt(0)==str2.charAt(i+1)) {
						break;
					}
					}
					
				}
				
			}
		 int first=0;
		 int length2=str2.length();
		 int last=length2-1;
		 int q= str1.length()/length2;
		 while(first<str1.length()) {
			 System.out.println(str1.substring(first, last+1));
			if(!sub.equals(str1.substring(first, last+1))) {
				
				System.out.println("nill");
				
				return "";
			}
		 
		 first=first+length2;
		 last=last+length2;
		 }
		
		return sub;
	        
	    }
	
	

	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABCDEF","ABC"));

	}

}
