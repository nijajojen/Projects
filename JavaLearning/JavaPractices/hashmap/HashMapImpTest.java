package hashmap;

public class HashMapImpTest {

	HashMapImpTest(int bucketCapacity){
		
	}
	public static void main(String[] args) {
		
		
		HashMapImp<String, Integer> hashMapObj= new HashMapImp<String, Integer>(16);
		
		hashMapObj.put("Nija", 1);
		hashMapObj.put("Alfie", 2);
		hashMapObj.put("binoy", 4);
		
		System.out.println(hashMapObj.get("Alfie"));

	}

}
