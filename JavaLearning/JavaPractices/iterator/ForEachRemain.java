package iterator;

import java.util.*;



public class ForEachRemain {

	public static void main(String[] args) {
		
		List<String> flowers= new ArrayList<String>();
		flowers.add("jasmine");
		flowers.add("thyme");
		
		Iterator<String> flowersIterator= flowers.iterator();
		flowersIterator.forEachRemaining(System.out::println);

	}

}
