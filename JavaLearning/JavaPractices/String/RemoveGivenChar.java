package String;

public class RemoveGivenChar {

	public static String removeChar(String str, char c) {
		if(str==null) {
			return null;
		}
		
		return str.replaceAll(Character.toString(c), "");
		
	}
	public static void main(String[] args) {
	
		String str="nija";
		char a='a';
		System.out.println(removeChar( str, a));

	}

}
