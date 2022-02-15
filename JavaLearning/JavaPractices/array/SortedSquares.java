package array;

public class SortedSquares {


	public static int[] sortedSquares(int[] A) {
		int temp;
		for(int i=0;i< A.length;i++) {
			A[i]= A[i]*A[i];
		}
		if(A.length==1) {
			return A;
		}
		for(int i=0;i< A.length;i++) {
			System.out.println(A[i]);
		}
		
		for(int j=0; j<A.length; j++) {
			for(int k=0; k<A.length; k++) {
				if(A[j]<A[k]) {
					temp=A[j];
					A[j]=A[k];
					A[k]= temp;
				}
			}
		}
		for(int i=0;i< A.length;i++) {
			System.out.println(A[i]);
		}
		return A;
	        
	    }
	public static void main(String[] args) {
		sortedSquares(new int[]{-4,-1,0,3,10});

	}

}
