package String;

public class NoOfOccuranceOfSubStrings {

	public static void main(String[] args) {
		String sub = "ij";
		String source= "nijanija";
		int i=0;
		String flag;
		int count=0;
		while(i<source.length()) {
			flag="green";
			for(int j=0;j<sub.length();j++) {
				if(i>=source.length())	{
					System.out.println(count);
					return;
				}
								
				if(source.charAt(i)!=sub.charAt(j)){
					flag="red";
					i++;
					break;
				}
				i++;
				
			}
			
			if(flag=="green")
				count++;
			
		}
		System.out.println("count= "+count);
	}

}
