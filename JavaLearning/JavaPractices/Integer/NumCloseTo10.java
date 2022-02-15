package Integer;
/*
 * Given 2 int values,
 * return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie. 
 * Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class NumCloseTo10 {

	public int close10(int a, int b) {
		int firstVal=Math.abs(10-a);
		int secVal=Math.abs(10-b);
		if( firstVal< secVal) {
			return a;
		}
		else if(firstVal > secVal) {
			return b;
		}
		else
			return 0;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumCloseTo10 checkInst = new NumCloseTo10();
		System.out.println(checkInst.close10(9, 1));
	}

}
