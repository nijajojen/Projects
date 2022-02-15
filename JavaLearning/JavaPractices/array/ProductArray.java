package array;

public class ProductArray {

	 public static int[] productExceptSelf(int[] nums) {
		 int product=1;
		 int length= nums.length;
		 int[] L= new int[length];
		 int[] R= new int[length];
		 int[] newArray= new int[length];
		 for(int i=0; i<length; i++) {
			 if(i==0)
				 L[i]=1;
			 L[i]=nums[i-1]*L[i-1];
			 
			 }
		 for(int j=length-1; j>=0;j--) {
			 if(j== length-1)
				 R[j]= 1;
			 R[j]=nums[j-1]*R[j-1];
		 }
		
		 for(int i=0;i<length-1; i++) {
			newArray[i]=R[i]*L[i]; 
		 }
		 
		return newArray;
	        
	    }
	public static void main(String[] args) {
		productExceptSelf(new int[] {4,5,1,8,2});

	}

}
