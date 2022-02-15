package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
	
	private Map<String,Integer> map;

	  public MyClass() {
	    map = new HashMap<>();
	    map.put("foo", 1);
	    map.put("bar", 3);
	  }
	  
	  public int getValue(String input, int numRetries) throws Exception {
		    try {
		      return map.get(input);
		    }
		    catch (Exception e) {
		      if (numRetries > 3) {
		        throw e;
		      }
		      return getValue(input, numRetries + 1);
		    }
	  }

	public static void main(String[] args) throws Exception {
		MyClass obj= new MyClass();
		System.out.println(obj.getValue("foo", 0));
	}

}
