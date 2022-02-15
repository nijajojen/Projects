package Integer;

/*
 * Given two non-negative int values,
 *  return true if they have the same last digit,
 *   such as with 27 and 57.
 *    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
public class FindLastDigit {

	public boolean lastDigit(int a, int b) {
		int firstVal,secVal;
		firstVal= a%10;
		secVal= b%10;
		if(firstVal== secVal) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
