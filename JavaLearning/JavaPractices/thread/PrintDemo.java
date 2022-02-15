package thread;

import java.util.ArrayList;

//T1.printCount()//pd1
//T2.doSomething()//pd2
public class PrintDemo {

	//		static ArrayList l = new ArrayList<>();

	
	 public  synchronized void printCount() {
		 
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	 
	 public  synchronized void printCount3() {
		 
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
}
