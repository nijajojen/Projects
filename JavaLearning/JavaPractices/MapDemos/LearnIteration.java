package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LearnIteration {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(4,3,2,8));
		System.out.println(bubbleSort(list));
	}
	
	public static List<Integer> bubbleSort(List<Integer> l) {
		boolean isSwapped= false;
		for(int i=0; i<l.size()-1;i++) {
			isSwapped= false;
			for(int j=0;j<l.size()-i-1;j++){
				if(l.get(j)> l.get(j+1)) {
					int temp= l.get(j);
					int val=l.get(j+1);
					l.set(j,val);
					l.set(j+1,temp);
					isSwapped= true;
				}
				if(!isSwapped)
					return  l;
			}
		}
		return l;
	}
}
