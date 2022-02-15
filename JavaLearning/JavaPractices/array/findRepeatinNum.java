package array;

import java.util.HashSet;
import java.util.Set;

public class findRepeatinNum {

	public static void main(String[] args) {
		int[] array= new int[] {2,4,2,6,4};
		boolean first=false;
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0;i<array.length; i++) {
			if(set.add(array[i])== false) {
				
				if(first==false)
					System.out.println(array[i]);
					first=true;
			}
			
		}

	}

}
