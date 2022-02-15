package String;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
/**
 * "001"
 * @author nija
 *
 */
public class CheckAnagrams {

	public static boolean isAnagram(String str1, String str2) {
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] charArray1= str1.toCharArray();
		char[] charArray2= str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		String sorted1= new String(charArray1);
		String sorted2= new String(charArray2);
		return sorted1.equals(sorted2);
		
		
	}
	public static void main(String[] args) {
		String aa = "12";
		
		aa = StringUtils.reverse(aa);
		
		char a[] = aa.toCharArray();
		int multiPlier = 1;
		int sum = 0;
		for(char ac : a) {
			int aInt = ac - 48;
			sum += aInt * multiPlier;
			multiPlier*=10;
			
		}
		System.out.println(sum);
		

	}

}
