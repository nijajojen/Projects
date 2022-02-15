package array;

public class RotationArrayUsingRxtraArray {

	public void rotate(int[] nums, int k) {
		int[] a= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			a[(i+k) % nums.length]=nums[i];
		}
		for(int j=0;j<nums.length;j++) {
			nums[j]= a[j];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
