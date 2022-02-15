package array;

public class ArrangeCoins {

	 public int arrangeCoins(int n) {
		 int count=0;
		 int i;
		 if(n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE){
	            return 65535;
	        }
		 if (n==1)
			 return 1;
		 for( i=1; i<=n; i++) {
			count=count+i;
			if(count>=n) {
				System.out.println(i-1);
				return i-1;
			}
			
		 }
		 
		
		return n;
	        
	    }
	public static void main(String[] args) {
		ArrangeCoins obj= new ArrangeCoins();
		obj.arrangeCoins(
				2147483647);
	}

}
