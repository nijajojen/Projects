package arraylist2;

public class ArrayListImpTest<V> {

	public static void main(String[] args) {
	
		ArrayListImp<String> arrayListObj= new ArrayListImp<String>(2);
		arrayListObj.add("Nija");
		arrayListObj.add("Binoy");
		arrayListObj.add("Alfie");
		arrayListObj.add(3, "andria");
		
		System.out.println(arrayListObj.get(3).toString());

	}

}
