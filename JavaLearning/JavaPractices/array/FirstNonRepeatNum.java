package array;

public class FirstNonRepeatNum {

	public static void main(String[] args) {
		
			int j;
		 int[] arr = new int[]{1,2,3,4,5,1,2,3,5,9};
		 for (int i=0; i < arr.length ;i++) {
	            for( j=0; j < arr.length ;j++) {
	                if (arr[i]==arr[j] && i!=j) {
	                    break;
	                }
	            }   
	            if (j == arr.length )
	                System.out.println( arr[i]);
	        

	}

	}
}
