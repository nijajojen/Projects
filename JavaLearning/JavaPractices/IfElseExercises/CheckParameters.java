package IfElseExercises;
/*
 * We have two monkeys, a and b, and 
 * the parameters aSmile and bSmile indicate if each is smiling. 
 * We are in trouble if they are both smiling or 
 * if neither of them is smiling. 
 * Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
public class CheckParameters {

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if(aSmile == bSmile)  {
			return true;
		}
	
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(monkeyTrouble(false,true));
	}

}
