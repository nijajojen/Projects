package String;
/*
 * Given a string, 
 * return true if the first instance of "x" in the string is immediately 
 * followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class FindDoubleX {

	
	static boolean doubleX(String str) {
		boolean xx=false;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)=='x') {
			if(str.substring(i, i+2).equals("xx")) {
				xx=true;
				break;
			}
		}}
		return xx;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doubleX("xxxxx"));
	}

}
