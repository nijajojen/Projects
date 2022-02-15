package CodingBatExercise;

/**
 * The parameter weekday is true if it is a weekday, 
 * and the parameter vacation is true if we are on vacation.
 *  We sleep in if it is not a weekday or we're on vacation.
 *   Return true if we sleep in.
 
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true

 *
 */
public class SleepIn {
	
	boolean weekday;
	boolean vacation;
	public boolean isSleepTime(boolean wday, boolean vtion) {
		if(wday== true) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		boolean sleeping;
		SleepIn sleepInst= new SleepIn();
		sleeping= sleepInst.isSleepTime(false, true);
		System.out.println(sleeping);
	}

	  // Solution notes: better to write "vacation" than "vacation == true"
	  // though they mean exactly the same thing.
	  // Likewise "!weekday" is better than "weekday == false".
	  // This all can be shortened to: return (!weekday || vacation);
}
