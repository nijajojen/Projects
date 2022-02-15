package leetcodestring;

public class WildCardMatching {

		  public static boolean isMatch(String word, String pattern) {
		    int wordLength = word.length(), patternLength = pattern.length();
		    int wordIndex = 0, patternIndex = 0;
		    int patternStarIndex = -1, wordTmpIndex = -1;

		    while (wordIndex < wordLength) {
		      // If the pattern caracter = string character
		      // or pattern character = '?'
		      if (patternIndex < patternLength && (pattern.charAt(patternIndex) == '?' || pattern.charAt(patternIndex) == word.charAt(wordIndex))){
		        ++wordIndex;
		        ++patternIndex;
		      }
		      // If pattern character = '*'
		      else if (patternIndex < patternLength && pattern.charAt(patternIndex) == '*') {
		        // Check the situation
		        // when '*' matches no characters
		        patternStarIndex = patternIndex;
		        wordTmpIndex = wordIndex;
		        ++patternIndex;
		      }
		      // If pattern character != string character
		      // or pattern is used up
		      // and there was no '*' character in pattern 
		      else if (patternStarIndex == -1) {
		        return false;
		      }
		      // If pattern character != string character
		      // or pattern is used up
		      // and there was '*' character in pattern before
		      else {
		        // Backtrack: check the situation
		        // when '*' matches one more character
		        patternIndex = patternStarIndex + 1;
		        wordIndex = wordTmpIndex + 1;
		        wordTmpIndex = wordIndex;
		      }
		    }

		    // The remaining characters in the pattern should all be '*' characters
		    for(int i = patternIndex; i < patternLength; i++)
		      if (pattern.charAt(i) != '*') return false;
		    return true;
		  }
		
	public static void main(String[] args) {
		System.out.println(isMatch("coder","code?"));
	}

}
