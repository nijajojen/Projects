package algorithms;

public class BinarySearch {
	
	/*
	 * we find out mid index
	 *  step 1:find mid, startindex+endindex/2
	 * check if mid value equals traget. if true return mid index.
	 * else if check taget< mid value. if true. end= mid-1, select the left portion.
	 * else target> mid val. start= mid+1.
	 * repeat step 1 until start index<=end index
	 */
	static int binarySearch(int[] nums
			,int target) {
		
		int start=0;
		int end= nums.length-1;
		int mid;
		while(start<= end ) {
			 mid= (start+end) /2;
			if(nums[mid]==target) {
				System.out.println(mid);
				return mid;
			}
			else if(target<nums[mid]) {
				
				end=mid-1;
			}
			else if(target>nums[mid]) {
				
				start= mid+1;
			}
		}
		System.out.println("-1");
		return -1;
		
	}

	public static void main(String[] args) {
		
		binarySearch(new int[] {-1,0,3,5,9,12}, 5);
	}

}
