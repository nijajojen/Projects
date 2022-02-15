package com.nija;

import java.util.*;

public class SwapListElemts {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		for(String a: args)
			list.add(a);
		Collections.shuffle(list, new Random());
		System.out.println(list);
		
	}
	
	
	public static <E> void swap(List<E> a, int i, int j) {
		E temp= a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
		
	}
	public static void shuffle(List<?> list, Random rnd) {
		for(int i=list.size(); i>1; i--) {
			swap(list, i-1 , rnd.nextInt(i));
		}
	}
	
}


