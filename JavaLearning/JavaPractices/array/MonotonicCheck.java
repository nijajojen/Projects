package array;

public class MonotonicCheck {

	public static boolean isMonotonic(int[] A) {
		if(A.length==1) {
			return true;
		}
		boolean a=isIncreasing(A);
		boolean b=isDecreasing(A);		
	
		if(a==true||b==true) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
	     return false;   
	    }
	public static boolean isIncreasing(int[] b) {
		for(int i=0; i<b.length-1; i++) {
			if(!(b[i]<=b[i+1])) {
				return false;
			}
		}
		return false;
	}
	
	public static boolean isDecreasing(int[] b) {
		for(int i=0; i<b.length-1; i++) {
			if(!(b[i]>=b[i+1])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		isMonotonic(new int[] {6,5,4,4});
	}

}
