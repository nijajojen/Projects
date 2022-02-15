package Integer;


public class Palindrome {

	public static boolean isPalindrome(int x) {
		 	int org= x;
	         int rev=0;
	         
	        if(x==0 || x%10==0 || x<0) 
	        	return false;
	        
			while (rev <org) {
	            int pop = x % 10;
	            x /= 10;
	          
	            rev = rev * 10 + pop;
	        }
			
			 System.out.println(org%10);
			    
			return rev==org || rev== org/10;
	       
	    
        
    }

	public static void main(String[] args) {
		

		System.out.println(isPalindrome(-1271));

	}

}
