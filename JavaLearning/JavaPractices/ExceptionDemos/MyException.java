package ExceptionDemos;

public class MyException extends Exception {
	String msg;
	
	MyException(String msg) {
		
		this.msg = msg;
	}

}
