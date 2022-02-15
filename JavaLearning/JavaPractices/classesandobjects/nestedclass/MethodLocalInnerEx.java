package classesandobjects.nestedclass;

public class MethodLocalInnerEx {

	 
	public void printMe() {
		 int j=1;
		class MethodLocal {
			static final float k=9;
			public void innerMethod() {
				 
				System.out.println(j);
			}
		}
		MethodLocal localObj = new MethodLocal();
		localObj.innerMethod();
		j=8;
	}

	public static void main(String[] args) {
		
		MethodLocalInnerEx obj= new MethodLocalInnerEx();
		obj.printMe();
	}

}
