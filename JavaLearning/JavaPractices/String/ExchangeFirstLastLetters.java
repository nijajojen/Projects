package String;
/*
 * Given a string, 
 * return a new string where the first and 
 * last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
	
public class ExchangeFirstLastLetters {
	
	public String frontBack(String str) {
		  
		 
		 if(str=="") {
			 return "empty string";
		 }
		 else {
			 char firstLetter= str.charAt(0);
			  char lastLetter= str.charAt(str.length()-1);
			  char temp= firstLetter;
			  firstLetter=lastLetter;
			  lastLetter= temp;
		  if(str.length()==1) {
			  return str;
		  }
		  else if(str.length()==2) {
			  return firstLetter +""+ lastLetter;
		  }
		  return firstLetter+ str.substring(1, str.length()-1)+ lastLetter;
		 }
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	ExchangeFirstLastLetters inst= new ExchangeFirstLastLetters();
	System.out.println(inst.frontBack(""));
	}

}
