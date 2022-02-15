package array;
import java.util.Arrays;
/*
 * Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class CountNine {

	public static int arrayCount9(int[] nums) {
		int count=0;
		
		  for(int i=0;i<nums.length; i++) {
			  if(nums[i]== 9) {
				  count++;
			  }
		  }
		  return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrayCount9(new int[]{1, 2, 9}));

	}

}
