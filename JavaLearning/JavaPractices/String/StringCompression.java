package String;

import java.util.HashMap;

public class StringCompression {

	public static String compress(String str) {
		int length=str.length();
		
	    //converting string to char array
		char[] c= new char[length];
		c= str.toCharArray();
		
		//Hashmap created for storing keys and mapping to its occurrence count.
		HashMap<Character,Integer> hashmap= new HashMap<>();
		for(int i=0;i<length;i++) {
			if(hashmap.get(c[i])!=null) {
				int val=hashmap.get(c[i]);
				val+=1;
				hashmap.put(c[i], val);
			}
			else {
				hashmap.put(c[i], 1);
			}
		}
	
		//finding total length of new compressing string
		int newLength=0;
		int i=0;
		for(char key: hashmap.keySet()) {
			newLength++;						
		}
		newLength*=2;
		
		if(newLength>=length) {
			return str;
		}
		else 
		{
			//compressing string using new length.			
			char[] newCharArray= new char[newLength];
			for(char key: hashmap.keySet()) {
				newCharArray[i]	=key;
				newCharArray[++i]=(char) (hashmap.get(key)+'0');
				i=i+1;
			}
			String newStr= new String(newCharArray);
			return newStr;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(compress("aabbb"));
	}

}
