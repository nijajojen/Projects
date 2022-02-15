package array;

public class BubbleSortNumbers {

	public static int[] sortArray(int[] nums) {
		 int j ;
			int temp;
	        int max;
			for(int i=0;i<nums.length;i++) {
				
				for( j=0; j<nums.length-1; j++) {
				 if(nums[j]>nums[j+1]){
	                 temp=nums[j];
	                 nums[j]=nums[j+1];
	                 nums[j+1]=temp;
	             }
				}
			}
			printArray(nums);
			return nums;
	    }
   
	

	private static int[] printArray(int[] nums) {
		for(int i=0;i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		return null;
	}


	public static void main(String[] args) {
		sortArray(new int[] {5,2,3,1});
	}

}
