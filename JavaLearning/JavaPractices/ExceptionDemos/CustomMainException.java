package ExceptionDemos;

public class CustomMainException {

	public static void main(String[] args) {
		try {
		throw new CustomException("new custom exception");
		}
		catch(CustomException msg) {
			System.out.println(msg);
		}

	}

}
