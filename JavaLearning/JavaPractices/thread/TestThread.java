package thread;

public class TestThread {

	public static void main(String[] args) {
		PrintDemo pd = new PrintDemo();
		ThreadDemo t1= new ThreadDemo("Thread-1", pd);
		ThreadDemo t2= new ThreadDemo("Thread-2", pd);
		t1.startMine();
		t2.startMine();
		try {
			t2.join();			t1.join();

		}catch(Exception e) {
			System.out.println("interupted");
		}
	}

}
