package MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("one",123);
		m.put("two", 234);
		m.put("three", 345);

		System.out.println(m);
		System.out.println(m.get("one"));
	
		System.out.println("\n");
		System.out.println("To return collection of values only");
		Collection<Integer> colctn = m.values();
		for(Integer x: colctn) {
			System.out.println(x);
		}
		System.out.println("\n To return set of keys");
		Set<String> colKeys= m.keySet();
		for(String x: colKeys) {
			System.out.println(x);
		}
		colKeys.stream().forEach(key->{System.out.println(key);});//java 8
		
	}

}
