package String;

/*
 * 
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class FindCharCount {

	public static boolean stringE(String str) {
		String[] words= str.split("e");
		if(words.length>=2 && words.length<4) {
			
				System.out.println((words.length-1) + " e");
			return true;
		}
		else
			System.out.println("false");
			return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringE("Heelele");
	}

}
