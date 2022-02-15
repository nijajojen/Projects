package array;

public class DistanceValBetween {

	
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count=0;
		boolean greater=true;
		int val;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0;j<arr2.length; j++) {
				val=Math.abs(arr1[i]-arr2[j]);
				if(val<=d) {
					greater=false;
				}							
			}
			if(greater==true) {
				count++;
			}
			greater=true;
			
		}
		System.out.println(count);
		return d;
	        
	    }
	public static void main(String[] args) {
		
		DistanceValBetween obj= new DistanceValBetween();
		obj.findTheDistanceValue(new int[] {2,1,100,3}, new int[] {-5,-2,10,-3,7},6);
	}

}
