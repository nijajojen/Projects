package ExceptionDemos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Main m= new Main();
		try {
		m.callMe("Test");
		  System.out.println("After Test1");	

		}catch(MyException e) {
		  System.out.println(e.msg);	
		}
		try {
			m.callMe("Nija");
			  System.out.println("After Test2");	

			}catch(MyException e) {
			  System.out.println(e.msg);	
			}
		
		
	}
	
	void callMe(String str) throws FileNotFoundException,MyException {
		//FileInputStream file= new FileInputStream("/Users/nija/Desktop/NijaResume");
		if ("Test".equals(str)) {
			throw new MyException("Test Message" + str);
		}
	}

}
