package String;

public class LongestCommonPrefix {

	public static String findComPrefix(String[] strs) {
		
		String prefix="";
		for(int i=0; i<(strs[0].length())&& i<(strs[1].length()) && i<(strs[2].length()); i++) {
			
			if(( Character.toString(strs[0].charAt(i)).equals(Character.toString(strs[1].charAt(i))) )
					&&( Character.toString(strs[0].charAt(i)).equals(Character.toString(strs[2].charAt(i)) ))) {
				prefix+=strs[0].charAt(i);
				
			}
			else {
				if(i==0) {
					return "\"\"";
				}
				
			}
			
			
		}
		
		return prefix;
		
	}
	public static void main(String[] args) {
		
		System.out.println(findComPrefix( new String[] {"dog","racecar","car"}));
	}

}
