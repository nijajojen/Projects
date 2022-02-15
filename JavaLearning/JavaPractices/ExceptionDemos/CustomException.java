package ExceptionDemos;

public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public CustomException(String msg) {
		this.message=msg;
	}
	public String toString() {
		return "Custom Exception occured: "+ message;
		
	}
	

}
