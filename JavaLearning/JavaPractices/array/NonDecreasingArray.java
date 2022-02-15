package array;



public class NonDecreasingArray {

	public static boolean check(int[] nums) {
		int count= 0;
		for(int i=0;i<nums.length-1;i++)
		{	
			if( nums[i]>nums[i+1] )
			{   
	            if(i>0)
	            {
		            if(nums[i-1]<=nums[i+1])
					nums[i]=nums[i-1];
					else
					nums[i+1]=nums[i];
	            }
				count++;
				if(count>1) {
				System.out.println("false");	
				return false;
				}
			}
		}
		
	    for(int i=0;i<=nums.length-1;i++){
	        System.out.println(nums[i]);
	    }
	    
	    System.out.println("true");	
		return true;
	    
	 }
	

	
	public static void main(String[] args) {
		check(new int[] {3,4,2,3});

	}

}
