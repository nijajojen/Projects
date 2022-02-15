package leetCode;
/**
 * Problem:
	Description:
	Word Search
	Inputs:
		String - A sentence
		String - The word to search in the sentence
	Outputs:
		Integer - how many times the searched word is in the sentence
	Requirements:
		The search must be case-sensitive and it must be whole word
	Example
		1st input: "Coders who code don't always eat cod. Exclaimed the coder who codes CODE." 
		example 2nd 
		input:"Code"
			Returns 0
		"code"
			returns 1
 * @author nija
 *
 */
public class WordCounting {

	/**
	 * 
	 * @param string
	 * @param searchItem
	 * @return int
	 */
	protected int countTheWord(String string, String searchItem) {
		String[] wordArray =string.split(" ");
		int count=0;
		int arrayLength= wordArray.length;
		for(int i=0;i<arrayLength;i++) {
			System.out.println(wordArray[i]);
			if((wordArray[i]).equals(searchItem)) 
				count+=1;
			
		}
		return count;
		
	}

}
