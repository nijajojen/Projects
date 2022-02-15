package ListDemos;

import java.util.HashSet;
import java.util.Set;
///I didnt understand how the equals method are called or what is x or what is object obs
public class HashCodeEx {

	public static void main(String[] args) {
		
	
		Set<Ainner> collection= new HashSet<Ainner>();
		collection.add(new Ainner(1));
		collection.add(new Ainner(2));
		collection.add(new Ainner(5));
		collection.add(new Ainner(1));
		
		for(Ainner x: collection) {
		System.out.println(x);
	}
}
	}
class Ainner {
	Integer x;
	Ainner(Integer x){
		this.x= x;
	}
	@Override
	public int hashCode() {
		return x;

	}
	@Override
	public boolean equals(Object obj) {
		Ainner o= (Ainner)obj;
		if(x.equals(o.x)) {
			return true;
		}
		else
			return false;
	}
}
