package String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueValue {

	 public static void main(String[] args) {
	        String s = "loveleetcode";
	        HashMap<Character, Integer> hashMap= new HashMap<Character, Integer>();
	        
	        for(int i=0;i<s.length();i++) {
	        	char c= s.charAt(i);
	        	hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
	        	
	        }
	        
	        for(int i=0;i<s.length();i++) {
	        	if(hashMap.get(s.charAt(i))==1) {
	        		System.out.println(i);
	        		return;
	        	}
	        }
	        
	        

	 }
}
