package ListDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		//List<Integer> collection= new ArrayList<Integer>();
		//Tryinh with HashSet
		/*Set<Integer> collection= new HashSet<Integer>();
		collection.add(6437);
		collection.add(6437);
		collection.add(5444);
		collection.add(7444);*/

	
	/*for(Integer x: collection) {
		System.out.println(x);
	}*/
		
		//The below code is to demonstrate hashcode value.
		A a= new A();
		System.out.println(a.hashCode());
		A a1= new A();
		System.out.println(a1.hashCode());
		System.out.println(a== a1);
		System.out.println(a.equals(a1));


}
	}
class A {
	@Override
	public int hashCode() {
		return super.hashCode()
;	}
	
}
