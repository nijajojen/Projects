package array;

public class InverseArray {

	public static int[][] flipAndInvertImage(int[][] A) {
		
		int temp;
		for(int row=0; row<3;row++) {
		for(int min=0,max=2;min<=max;max--,min++) {
			temp=A[row][min];
			A[row][min]=A[row][max];
			A[row][max]=temp;
			temp=0;
			
		}
		}
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				if(A[x][y]==1) {
					A[x][y]=0;
				}
				else {
					A[x][y]=1;
				}
			}
		}
		return A;
        
    	}
	public static void main(String[] args) {
		int[][] invertArray=flipAndInvertImage(new  int[][] {{1,1,0},{1,0,1},{0,0,0}});
		display(invertArray);
		
	
	}
	public static void display(int[][] invertArray) {
		System.out.println("{");
		for(int x=0;x<3;x++) {
			System.out.print("{");
			for(int y=0;y<3;y++) {
				System.out.print(invertArray[x][y]+",");
				
			}
			System.out.print("} ,");
		}
		System.out.print("}");
		}
		
	}


