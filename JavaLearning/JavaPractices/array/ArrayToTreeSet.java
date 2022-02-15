package array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToTreeSet {
/*
 * first convert array to list.
 * then convert list to treeset
 * 
 */
	public static void main(String[] args) {
		Integer[] array= new Integer[] {4,3,2,1};
		List<Integer> list=Arrays.asList(array);
		Set<Integer> set= new TreeSet<Integer>(list);
		for(Integer val: set) {
			System.out.println(val);
		}
		

	}

}
