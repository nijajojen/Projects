package Integer;
/*
 * Given two int values, 
 * return their sum. 
 * Unless the two values are the same, 
 * then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
public class SumOf2Num {

	public static int sumDouble(int a, int b) {
		int sum= a+b;
		 if(a==b) {
			 return sum*2;
		 }
		 else {
			 return sum;
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDouble(5,5);
	}

}
