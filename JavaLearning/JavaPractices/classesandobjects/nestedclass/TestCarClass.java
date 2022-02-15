package classesandobjects.nestedclass;

public class TestCarClass {

	public static void main(String[] args) {
		Civic civicObj= new Civic();
		Car carUnknown = new Car() {

			@Override
			public void model() {
				System.out.println("Uknown");
				
			}
			
		};
		
		civicObj.model();
		carUnknown.model();
		

	}

}
