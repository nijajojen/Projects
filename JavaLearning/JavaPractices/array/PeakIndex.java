package array;

public class PeakIndex {
	static int[] array;
	 public int peakIndexInMountainArray(int[] A) {
		 if(A.length<3)
			 return -1;
		 array= new int[A.length];
		 for(int i=0; i<A.length; i++) {
			 array[i]= A[i]; 
		 }
		 int i=0;
		 int index=0;
		 if(A[i]<A[i+1]) {
		 while(A[i]<A[i+1] && i<A.length) {
			 i++;
			 
		 }
		 index=i;
		 if(A[i]>A[i+1]) {
			 return index;
		 }
		 }
		 else {
			return -1; 
		 }
		return 0;
	        
	    }
	public static void main(String[] args) {
		PeakIndex pi= new PeakIndex();
		int a=pi.peakIndexInMountainArray(new int[] {0,1,0});
		if(a==-1) {
			System.out.println("no peak index");
		}
		else {
			System.out.println(array[a]);
		}
	}

}
