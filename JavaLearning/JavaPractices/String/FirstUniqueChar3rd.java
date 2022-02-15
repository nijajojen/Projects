package String;

public class FirstUniqueChar3rd {

	 public static int firstUniqChar(String s) {
	      int[] indexes = new int[26];
	    for(int i=0; i<s.length(); i++)
	    {
	        int ch = s.charAt(i)-'a';
	        indexes[ch] = indexes[ch]==0 ? ~i : 1;
	    }

	    int min = Integer.MAX_VALUE;
	    for(int index : indexes)
	        if(index<0) min=Math.min(min, ~index);
	    return min==Integer.MAX_VALUE ? -1 : min;
		      
	    }
	public static void main(String[] args) {
		String s="nnijjaa";
		firstUniqChar(s);

	}

}
