package com.nija;

import java.util.*;

public class FindDups2 {

	public static void main(String[] args) {
		// To findout which words in the arg list is not repeated
		// To find which words repeated
		//do not want any duplicates print repeatedly
		
		Set<String> uniques= new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		List<String> arryList= new ArrayList<String>();
		
		for(String item: args)
			if(!uniques.add(item))
				dups.add(item);
		for(String item: args)
			arryList.add(item);
		System.out.println(dups);
		System.out.println(arryList.removeAll(dups));
		System.out.println(uniques.removeAll(dups));
		System.out.println(uniques);
		System.out.println(arryList);
		//why in set duplicate elements are added.[Binoy, Nija, Nija]

	}

}
