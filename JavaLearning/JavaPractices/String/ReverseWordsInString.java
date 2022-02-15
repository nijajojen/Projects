package String;

public class ReverseWordsInString {

	public static void reverseWords(String s) {
		String[] stringArray;
		stringArray= s.split(" ");
		String newString="";
		for(int i=0;i<stringArray.length;i++) {
			String tempWord= stringArray[i];
			String[] tempArray= tempWord.split("");
			for(int j=(stringArray[i].length())-1;j>=0; j--) {
				newString+=tempArray[j];
			}
			newString+= " ";
			
		}
		System.out.println(newString);
		
	}
	public static void main(String[] args) {
		
		reverseWords("Let's take");

	}

}
