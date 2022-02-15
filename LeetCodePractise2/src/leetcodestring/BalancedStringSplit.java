package leetcodestring;

public class BalancedStringSplit {

	 int i=0;
	 int balance=0;
	public int stringSplit(String word) {
		
		int count=0;
		if(word==null || word.length()==0) {
			return 0;
		}
		while(i<word.length()) {
			while(word.charAt(i)=='R') {
				balance++;
				if(balance==0)
					count++;
				i++;
				if(i==word.length())
					return count;
			}
			while(word.charAt(i)=='L') {
				balance--;
				if(balance==0)
					count++;
				i++;
				if(i==word.length())
					return count;
				
			}
			
			
		}
		return count;
		
		}	
	
	public static void main(String[] args) {
		BalancedStringSplit spliObj= new BalancedStringSplit();
		System.out.println(spliObj.stringSplit("RLRRRLLRLL"));

	}

}
