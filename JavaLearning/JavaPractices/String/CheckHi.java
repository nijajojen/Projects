package String;
/*
 * 
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class CheckHi {
	String checkWord;
	public boolean startHi(String str) {
		checkWord= str.substring(0, 2);
		if(checkWord.equals("Hi") )
			return true; 
		else 
			return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckHi hiInst= new CheckHi();
		System.out.println(hiInst.startHi("Hi Dicruz"));
	}

}
