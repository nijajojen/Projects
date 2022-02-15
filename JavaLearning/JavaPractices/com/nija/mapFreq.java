package com.nija;

import java.util.*;

public class mapFreq {

	public static void main(String[] args) {
	
		Map<String, Integer> mapInst= new HashMap<String, Integer>();
		for(String a: args) {
			Integer freq= mapInst.get(a);
			mapInst.put(a, freq == null? 1:freq+1);
		}
		
		System.out.println(mapInst.size()+ "Distinct Words:");
		System.out.println(mapInst);
	}

}
//what is get() returns		solved
/* it returns the value to which the specified key is mapped.
 *  if no value it returns null
 * get(Object key)
 */
//if it is to be it is up to me to delegate
//what is put()
/*
 * put(key, value)
 * if existing key and new value passed,it updates the value.
 * if new pair,insert as whole
 * return- if existing key passed, return its value. and 
 * if new key passed returns null
 *  
 */
