package overriding;

public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
		c.callMe();
		//c.callSuper();
		//parent.callSub();		why method callSub() is undefined for the type Parent?????????
		c.callSub();

	}

}
class Parent{
	void callMe() {
		System.out.println("Parent");
	}
	void callSuper() {
		System.out.println("callSuper");
	}
}
class Child extends Parent{
	void callMe() {
		System.out.println("Child");
	}
	void callSub() {
		System.out.println("callSub");
		
	}
}
