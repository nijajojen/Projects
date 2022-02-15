package array;

import java.util.HashSet;

public class ShuffleArray {

	int length;
	int[] nums;
	int[] resetArr;
	
	public ShuffleArray(int[] nums) {
	         length=nums.length;
	         this.nums= nums;
	         resetArr=new int[nums.length];
	         
	         for(int j=0;j<nums.length;j++) {
	     		resetArr[j]= nums[j];
	     	} 
	    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	System.out.println("resetArr");
    	for(int j=0;j<nums.length;j++) {
     		System.out.println(resetArr[j]);
     	}
		return resetArr;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	System.out.println("shuffle");
    	  for(int j=0;j<nums.length;j++) {
	     		nums[j]=resetArr[j];
	     	} 

    	int[] numsNew= new int[nums.length];
    	int index=0;
    	int status =-1;
    	int dupLength=length;
    	int i=0;
    	while(dupLength>0) {
    		
       		index=(int) (Math.random()*10 % (dupLength));    		
    		numsNew[i]= nums[index]; 		

    		nums=removeElement(nums,index,dupLength);
    		dupLength--;
    		i++;
    	
    		
    	}
    	for(int j=0;j<nums.length;j++) {
    		System.out.println(numsNew[j]);
    	}
		return numsNew;
        
    }
    public static int[] removeElement( int[] arr,int index,int dupLength) {
    	
    	for(int i=index; i<dupLength;i++) {
    		if(i==arr.length-1) {
    			arr[i]=0;
    			
    		}
    		else {
    		arr[i]= arr[i+1];
    		}
    		
    	}
		return arr;
    	
    }
	public static void main(String[] args) {
		int[] nums=  new int[] {6,5,1,10};
		ShuffleArray obj = new ShuffleArray(nums);
		//System.out.println(obj.length);
		 int[] param_1 = obj.reset();
		 int[] param_2 = obj.shuffle();

	}

}
