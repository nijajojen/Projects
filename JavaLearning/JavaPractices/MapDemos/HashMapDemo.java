package MapDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hashMap = new HashMap<String, Double>();
		
		  hashMap.put("Zara", new Double(3434.34));
	      hashMap.put("Mahnaz", new Double(123.22));
	      hashMap.put("Ayan", new Double(1378.00));
	      hashMap.put("Daisy", new Double(99.22));
	      hashMap.put("Qadir", new Double(-19.08));
	      
	      
	      
	      Set<Map.Entry<String, Double>> entriesSet= hashMap.entrySet();
	      Iterator<Map.Entry<String, Double>> iteratorEntriesSet =entriesSet.iterator();
	      while(iteratorEntriesSet.hasNext()) {
	    	  Map.Entry<String, Double> anEntrySet= iteratorEntriesSet.next();
	    	  System.out.print(anEntrySet.getKey() + ": ");
	          System.out.println(anEntrySet.getValue());
	      }
	      
	      
	      
	      double balance= hashMap.get("Zara").doubleValue();
	      hashMap.put("Zara",new Double( balance+1000));
	      System.out.println(hashMap.get("Zara"));

	}

}
