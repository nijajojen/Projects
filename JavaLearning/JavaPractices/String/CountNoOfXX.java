package String;
/*
 * Count the number of "xx" in the given string. 
 * We'll say that overlapping is allowed, 
 * so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3

 */
public class CountNoOfXX {

	static int countXX(String str) {
		int count=0;
		boolean xxStatus= false;
		for(int i=0;i<str.length();i++) {
			if(xxStatus== false) {
				if(str.charAt(i)== 'x' && str.charAt(i+1)== 'x') {
					count+=1;
					xxStatus= true;
					continue;
				}
			}
			
			else if(str.charAt(i)=='x' ) {
				if(xxStatus== true) {
					if(i+1 < str.length()&& str.charAt(i)=='x')
						count+=1;
						continue;
						
				}
				count+=1;
			}
			
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countXX("Hexxo thxxe"));
	}

}
