package hashmap;

public class HashMapImp<K,V> {
		
	 int bucketCapacity=16;
	 Node<K,V>[] array;
	 public HashMapImp(int bucketCapacity) {
		 this.bucketCapacity= bucketCapacity;
	 }
	/*
	 * returns the old value if the same key entered again, 
	 * and replaces the old value by new value.
	 * If an entire new key is entered null value is returned.
	 */
	@SuppressWarnings("unchecked")
	public V put(K key,V value) {
		
		int hash=key.hashCode();
		int bucket= hash% bucketCapacity;
		
		if (array == null) {
			 array= (Node<K, V>[])new Node[bucketCapacity];
		}
		
		Node<K, V> newNode= new Node<K, V>(key, value);
		if(array[bucket]!=null) {
			
			Node<K, V> aNode=array[bucket];
			
			while(aNode.next!=null ) {
				if(aNode.key.equals(key)) {
					String val=(String) aNode.value;
					aNode.value=value;
					return (V)val;
				}
				aNode=aNode.next;				
			}
			
			
			aNode.next= newNode;
			newNode.next=null;
			
		}
		
		
		System.out.println(newNode.key.toString() + newNode.value.toString());
			
	
	
	return null;				
		
	}
	
	
	
	public V get(K keyy) {
		int hash= keyy.hashCode();
		int bucket= hash%bucketCapacity;
		Node<K,V> firstNode=array[bucket];
		while(firstNode!=null) {
			if(firstNode.key.equals(keyy) ) {
				return firstNode.value;
			}
		}
		return null;
				
	}
}
