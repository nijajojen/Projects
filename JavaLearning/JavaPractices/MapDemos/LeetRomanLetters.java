package MapDemos;
import java.util.Map;
import java.util.HashMap;


public class LeetRomanLetters {

	public static int findNumValue() {
	Map<String, Integer> m= new HashMap<String, Integer>();
	m.put("I",1); m.put("V", 5);
	m.put("X", 10); m.put("L", 50);
	m.put("C", 100); m.put("D", 500);
	m.put("M", 1000);
	
	String romanl="MCMXCIV";
	int sum=0;
	int i=0;
	while(i< romanl.length()) {
		if((i+1)>=romanl.length()) {
			sum+=m.get(Character.toString(romanl.charAt(i)));
			return sum;
		}
		if(m.get(Character.toString(romanl.charAt(i))) < m.get(Character.toString(romanl.charAt(i+1)))){
			sum= sum+ m.get(Character.toString(romanl.charAt(i+1))) - m.get(Character.toString(romanl.charAt(i)));
			i=i+2;
			
		}
		else {
			sum= sum+ m.get(Character.toString(romanl.charAt(i)));
			i= i+1;
			
		}
	}
	return sum;
	
	}
	public static void main(String[] args) {
		
		System.out.println(findNumValue());
	}

}
