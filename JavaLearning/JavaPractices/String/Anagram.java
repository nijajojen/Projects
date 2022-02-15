package String;

import java.util.Arrays;

public class Anagram {
	 public int solution(String A, String B) {
		 String  strA= A.replaceAll("\s", "");
		 
	        String strB = B.replaceAll("\s", "");
	        
	        boolean isAnagram = true;
	 
	        if(strA.length() != strB.length()){
	        	isAnagram = false;
	        }else {
	            //Convert into character array
	 
	            char[] strAArray = strA.toLowerCase().toCharArray();
	 
	            char[] strBArray = strB.toLowerCase().toCharArray();
	 
	            //Sorting both character array
	 
	            Arrays.sort(strAArray);
	 
	            Arrays.sort(strBArray);
	 
	            //Check if both arrays are equal
	 
	            isAnagram = Arrays.equals(strAArray, strAArray);
	            if(isAnagram){
		            return 0;
		        } 
	            //int numberChar = 0;
	            
	           
	        }
	        
		 return 0;
	 }
}
