package String;

public class Reverse {

	public static void reverseString(char[] s) {
	      int length=s.length;
	      char temp;
	      for(int i=0;i<length/2;i++) {
	    	  temp= s[i];
	    	  s[i]=s[length-1-i];
	    	  s[length-1-i]=temp;
	      }
	      
	      System.out.println(String.valueOf(s));
	      
	    }
	public static void main(String[] args) {
		char[] array= {'n','i','j','a'};
		reverseString(array);

	}

}
