package Integer;
/*
 * Given an int n, 
 * return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
public class Diff {

	public int diff21(int n) {
		  int absDiff= Math.abs(21-n);
		  if (n>21) {
			  return 2*absDiff;
		  }
		  else {
			  return absDiff;
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
