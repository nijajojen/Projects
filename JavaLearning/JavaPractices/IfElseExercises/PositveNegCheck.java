package IfElseExercises;
/*
 * Given 2 int values, 
 * return true if one is negative and one is positive. 
 * Except if the parameter "negative" is true, 
 * then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */
public class PositveNegCheck {

	public boolean posNeg(int a, int b, boolean negative) {
		if((a<0 && b>0) ||  (b<0 && a>0)) {
			if(negative == true) {
				if(a<0 && b<0) {
					return true;
				}
				return false;
			}
			
			return true;
		}else if( negative==true && a<0 && b<0)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositveNegCheck inst = new PositveNegCheck();
		System.out.println(inst.posNeg(-4, -5, true));
	}

}
