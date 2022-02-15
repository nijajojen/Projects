package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratoorEx implements Iterable{

	public static void main(String[] args) {
		
		List<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(0);
		arrayList.add(3);
		
		ListIterator<Integer> listIter= arrayList.listIterator();
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		
		while(listIter.hasPrevious()) {
			System.out.println(listIter.previous());
		}

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
