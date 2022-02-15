import java.util.ArrayList;
import java.util.List;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		List<String> arrayList= new ArrayList<String>();
		
		arrayList.add("alfie");
		arrayList.add("nija");
		arrayList.add("binoy");
		
		String[] array=  arrayList.toArray(new String[arrayList.size()]);
		/*String[] array= new String[4];
		
		for(int i=0;i<arrayList.size();i++) {
			array[i]=arrayList.get(i);
			System.out.println(array[i]);
		}
		*/
		
	}

}
