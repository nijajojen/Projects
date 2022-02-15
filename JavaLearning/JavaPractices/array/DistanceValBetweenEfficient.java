package array;

import java.util.Arrays;

public class DistanceValBetweenEfficient {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     int ceiling = 0;
     int ret= 0;
     for(int i = 0;i<arr1.length;i++){
         int arr1Val = arr1[i];
         ceiling = getCeiling(arr1Val, arr2, ceiling);
         
         if(Math.abs(arr1Val-arr2[ceiling] )<=d){
             continue;
         }else if (ceiling > 0 && Math.abs(arr1Val-arr2[ceiling-1] )<=d){
             continue;
         }

         ret++;
         
     }
     System.out.println(ceiling);
     System.out.println(ret);
     return ret;
 }
  private int getCeiling(int val,int[] arr2, int lastIndex){
     for(int i =lastIndex; i < arr2.length;i++){
         if(arr2[i]> val){
             return i;
         }
     }
     //means no value is smaller than val
     return arr2.length-1;
 }
	public static void main(String[] args) {
		DistanceValBetweenEfficient obj= new DistanceValBetweenEfficient();
		obj.findTheDistanceValue(new int[] {4,5,8}, new int[] {10,9,1,8},6);


	}

}
