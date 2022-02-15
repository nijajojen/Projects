package overriding;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animal anim= new Animal();//Animal reference and animal object
			Animal dog= new Dog();//Animal reference but dog object.
			anim.move();
			dog.move();
			dog.bark();
	}

}
