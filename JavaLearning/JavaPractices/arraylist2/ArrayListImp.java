package arraylist2;

import java.lang.reflect.Array;

public class ArrayListImp<V> {
	int capacity=5;
	static int tail=-1;
	V[] values;
	
		
	@SuppressWarnings("unchecked")
	 ArrayListImp(int capacity){
		//array= (V[])Array.newInstance( capacity);
		values = (V[]) new Object[capacity];
		
	}
	
	boolean add(V val) {
		tail++;
		values[tail]= val;
		System.out.println(values[tail]+" inserted");
		return true;		
	}
	
	@SuppressWarnings("unchecked")
	void add(int index, V val) {
		
	
		
			if(index>= capacity/2 ) {
				capacity= capacity*2;
				V[] newValues= (V[]) new Object[(capacity)];
				initializeArrayAgain(newValues);
			}
		
		values[index]=val;		
	}
	
	private V initializeArrayAgain(V[] newValues) {
		int j=0;
		while(j<values.length) {
			newValues[j]= values[j];
			j++;
			
		}
		values= newValues.clone();
		return (V) values;
	}

	V get(int index) {
		
		return values[index];
		
	}
	
	

}
