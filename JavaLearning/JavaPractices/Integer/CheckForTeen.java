package Integer;
/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 3 int values,
 *  return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
public class CheckForTeen {

	
	public boolean hasTeen(int a, int b, int c) {
		if(a== (int)a && b==(int)b && c==(int)c) {
			if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19))
				return true;
			else
				return false;
			
		  }
	else {
		System.out.println("Enter a number");
		return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckForTeen checkInst= new CheckForTeen();
		System.out.println(checkInst.hasTeen(10, 'a', 20));

	}

}
