package array;

import java.util.Arrays;

/*
 * Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

	public static int[] findTarget(int[] array, int target) {
		
		for(int i=0; i<array.length; i++) {
			for(int j=i;j<array.length;j++) {
				if(array[j]== target- array[i]) {
					return new int[] {i,j};
				}
			}
			
		}
		return null;
	}
	public static void main(String[] args) {
		
		int targetIndex[]= findTarget(new int[] {2, 7}, 9);
		System.out.println(Arrays.toString(targetIndex));
	}

}
