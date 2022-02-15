package array;

public class RotateArray {
	
	public void rotate(int[] nums, int k) {
		int temp=0,newTemp;
		if(nums.length==1) {
			
		
		
	     for(int rotation=0;rotation<(k);rotation++) {
	    	
	    	for(int i=0; i<nums.length; i++) {
	    		
	    		if(i==0) {
	    			temp=nums[i+1];
	    			nums[i+1]=nums[i];
	    			
	    		}
	    		else if(i==nums.length-1){
	    			nums[0]=temp;
	    			temp=nums[i];
	    		}
	    		else {
	    			newTemp=nums[i+1];
	    			nums[i+1]=temp;
	    			temp=newTemp;	    				    			
	    		}
	    		
	    	}
	     }
	     printArray(nums);
		}
	    }
	public static void printArray(int[] arr) {
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		RotateArray ro=new RotateArray();
				ro.rotate(new int[] {1,2,3,4,5}, 3);

	}

}
