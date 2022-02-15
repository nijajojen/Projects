package leetcodestring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wildcardmatchRegulaExp {

	public int countWordWithRegEx(String sentence, String searchPattern) {
		if (sentence == null || searchPattern == null)  {
			return 0;
		}
		if(sentence.trim().length() == 0 && searchPattern.trim().length() == 0) {
			return 1;
		}
		Pattern pattern = Pattern.compile(searchPattern);
		Matcher matcher = pattern.matcher(sentence);
		int wordCount = 0;
		while (matcher.find()) {
			wordCount++;
		}
		return wordCount;
	}
	public static void main(String[] args) {
		wildcardmatchRegulaExp obj= new wildcardmatchRegulaExp();
		System.out.println(obj.countWordWithRegEx("aa", "a*"));
	}

}
