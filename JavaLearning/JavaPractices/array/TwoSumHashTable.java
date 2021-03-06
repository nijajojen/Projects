package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashTable {

	public static void main(String[] args) {

		int targetIndex[]= twoSum(new int[] {2, 7}, 9);
		System.out.println(Arrays.toString(targetIndex));

	}
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

}
