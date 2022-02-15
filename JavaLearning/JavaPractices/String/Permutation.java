package String;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;


public class Permutation {

	public static boolean checkInclusion(String s1) {
		Set<String> hashSet= new HashSet<String>();
		int index;
		int len=s1.length();
		char temp;
		String tempString;
		char[] array=s1.toCharArray();
		for(int i=0; i<len; i++) {
			for(int j=0;j<len;j++) {
				temp= array[i];
				array[i]= array[j];
				array[j]=temp;
				
				
				
				 tempString=String.valueOf(array);
						
				
				if(hashSet.contains(tempString)==false) {
					hashSet.add(tempString);
				}
			}
		}
		
			
			hashSet.forEach(element -> System.out.println(element));
		
		return false;
	        
	    }
	public static void main(String[] args) {
		checkInclusion("abc");

	}

}
