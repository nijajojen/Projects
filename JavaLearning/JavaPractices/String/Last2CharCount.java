package String;
/*
 * Given a string, return the count of the number of times
 *  that a substring length 2 appears in the string 
 *  and also as the last 2 chars of the string, 
 *  so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
public class Last2CharCount {
	public static int last2(String str) {
		if(str.length()==1 ||str.length()== 0 ) {
			System.out.println("String length is 1.");
		}
		String sub = str.substring(str.length()-2);
		
		String eachSub;
		int count=0;
		for(int i=0; i < str.length()-2; i++) {
			if(i+2== str.length() -1)
				break;
			eachSub=str.substring(i,i+2);
			System.out.println(eachSub);
			if(sub.equals(eachSub))
				count++;
			
		}
		
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(last2("hi"));
	}

}
