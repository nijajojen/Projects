package classesandobjects.nestedclass;

//inner class
public class OuterClass {
	 private int i=1;
	 
		 class InnerClass{
			final static int j=1;
			
			public void printMe() {
				System.out.println(i);
			}
		}
		
	public static void main(String args[]) {
		
		OuterClass outerObj= new OuterClass();
		InnerClass innerObj= outerObj.new InnerClass();
	}
}
