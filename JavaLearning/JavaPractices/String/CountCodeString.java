package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCodeString {

	public static int countCode(String str) {
		Pattern pattern= Pattern.compile("co[a-z]e");
		Matcher matcher=pattern.matcher(str);
		int last=0;
		int count=0;
		while(matcher.find(last)) {
			last=matcher.end();
			count++;
		}
		System.out.println(count);
		return 0;
		  
	}
	public static void main(String[] args) {
		countCode("aaacodecofebbb");

	}

}
