package Integer;

/*
 * Given 2 positive int values,
 * return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class FindMaxInRange {

	public int max1020(int a, int b) {
		if((a>=10 && a<=20) || (b>=10 && b<=20)) {
			if((a>=10 && a<=20) && (b>=10 && b<=20)){
				if (a>b)
					return a;
				else
					return b;
			}
			else if(a>=10 && a<=20) {
				return a;
			}
			else
				return b;
				
		}
		else {
			return 0;
		}
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
