package IOStreamDemos;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		InputStream inputStream= System.in;
		////FileInputStream is a subclass of InputStream.
		//InputStream inputStream= new FileInputStream("/Users/nija/Desktop/NijaResume.pdf");
		//int x= inputStream.read();
		//System.out.println(x);
		//it prints aci value
		////only read one character.
		
		/*Scanner scan= new Scanner(inputStream);
		String str= scan.nextLine();
		
		System.out.println(str);*/
	/////////////////////////////////////DOUBT. ITS CREATING NEW FILE	
		
		//To write to a file
		/*Writer write= new FileWriter("/Users/nija/Desktop/NijaDemoWiter.txt");
		PrintWriter printwriter = new PrintWriter(write);
		printwriter.println("Double success!!!!");
		write.close();*/
		
		
		//To print to the console
		/* Writer writer = new OutputStreamWriter(System.out);
		PrintWriter printwriter= new PrintWriter(writer);
		printwriter.println("hello");
		writer.close(); */
		
		// How to convert input stream to reader?
		
		Reader reader= new InputStreamReader(System.in);
		
	
		
		
	}

}
