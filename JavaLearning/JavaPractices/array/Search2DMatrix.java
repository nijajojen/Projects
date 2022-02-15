package array;

public class Search2DMatrix {

	 @SuppressWarnings("unused")
	public static boolean searchMatrix(int[][] matrix, int target) {
		 
		 if(matrix.length==0 || matrix[0].length==0){
	           return false;
	       }
		 int rows=matrix.length;
		 int column= matrix[0].length;
		 for(int i=0;i<rows;i++) {
			 
		  if(matrix[i][0] <target && matrix[i][rows-1]>target) {
				for(int j=0;j<column;j++) {
					if(target== matrix[i][j]) {
						System.out.println(target);
						return true;
					}
				}
					 				 
			 }
		 }
		return false;
		 
	 }
	public static void main(String[] args) {
		searchMatrix(new int[][] {
		                           {1,   4,  7, 11, 15},
		                           {2,   5,  8, 12, 19},
		                           {3,   6,  9, 16, 22},
		                           {10, 13, 14, 17, 24},
		                           {18, 21, 23, 26, 30}
		                         }, 20);

	}

}
