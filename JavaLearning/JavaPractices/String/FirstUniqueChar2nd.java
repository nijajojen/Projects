package String;

import java.util.HashMap;

public class FirstUniqueChar2nd {

	public int firstUniqChar(String s) {
		HashMap<Character, Integer> countingMap=
				new HashMap<Character, Integer>();
		int n= s.length();
		for(int i=0;i<n;i++) {
		countingMap.put(s.charAt(i),countingMap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(int j=0;j<n;j++) {
			if(countingMap.get(s.charAt(j))==1) {
				return j;
			}
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
