package MapDemos;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSumHashMap {

	public static int[] findTarget(int[] array, int target) {
		Map<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
		int complement=0;
		for(int i=0; i<array.length; i++) {
			complement= target- array[i];
			if(hashMap.containsKey(complement)) {
				return new int[] {i, hashMap.get(complement)};
			}
			hashMap.put(array[i], i);
		}
		
		return null;
	}
	public static void main(String[] args) {
		
		int targetIndex[]= findTarget(new int[] {1, 7, 2}, 9);
		System.out.println(Arrays.toString(targetIndex));
	}

}
