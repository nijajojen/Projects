package constructor;

public class FirstConstructor {

	public static void main(String[] args) {
		MyClass t1 = new MyClass(100)
;
		MyClass t2= new MyClass(200);
		System.out.println(t1.num);
		System.out.println(t2.num);
	}

}
