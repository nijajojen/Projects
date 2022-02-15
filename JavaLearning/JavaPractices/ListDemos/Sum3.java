package ListDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

	 public static List<List<Integer>> threeSum(int[] nums) {
		 Arrays.sort(nums);
		 
		 List<List<Integer>> resList= new ArrayList<>();
		 
		 for(int i=0; i<nums.length&&nums[i]<=0; ++i) {
			 if(i==0 || nums[i-1]!= nums[i]) {
				 twoSum(nums,i, resList);
			 }
		 }
		 
		 for(int j=0;j<resList.size();j++) {
				System.out.println(resList.get(j));
			}
		return null;
	        
	    }
	private static void twoSum(int[] nums, int i, List<List<Integer>> resList) {
		
		int low=i+1;
		int hi= nums.length-1;
		while(low<hi) {
			int sum= nums[i]+nums[low]+nums[hi];
			if(sum<0) {
				low++;
			}
			else if(sum>0) {
				--hi;
			}
			else {
				resList.add(Arrays.asList(nums[i],nums[low++],nums[hi--]));
			}
			
			while(low<hi && nums[low-1]== nums[low]) {
				low++;
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		threeSum(new int[] {-1,-1,2,-2,2});

	}

}
