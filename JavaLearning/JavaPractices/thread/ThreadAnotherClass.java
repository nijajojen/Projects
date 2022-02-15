package thread;

public class ThreadAnotherClass  {
		
	public static void main(String args[]) {
		ThreadEx1 R1= new ThreadEx1("Thread-1");//R1 is a runnable.
		R1.startEx();
		ThreadEx1 R2= new ThreadEx1("Thread-2");
		R2.startEx();
	}
}
