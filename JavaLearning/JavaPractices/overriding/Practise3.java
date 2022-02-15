package overriding;

public class Practise3 {

	public static void main(String[] args) {
		B b= new B();
		b.j=10;
		b.i=20;
		
		b.i= b.j;
		b.printNum();

	}

}
class A{
	int i;
	public void printNum() {
		System.out.println(i);
	}
}

class B extends A{
	int j;
	public void printNum() {
		System.out.println(j);
	}
}

