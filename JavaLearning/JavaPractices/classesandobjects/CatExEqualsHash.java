package classesandobjects;

public class CatExEqualsHash {
	
	String firstName;
	int rollNumber;
	
	
	CatExEqualsHash(String firstName , int rollNumber){
		this.firstName=firstName;
		this.rollNumber= rollNumber;
	}

	public boolean equals(Object obj) {
		CatExEqualsHash ref= (CatExEqualsHash)obj;
		return (this.firstName.equals(ref.firstName) && this.rollNumber==ref.rollNumber);
				
	}
	
	public static void main(String[] args) {
		
		CatExEqualsHash obj1= new CatExEqualsHash("Nija",1);
		CatExEqualsHash obj2= new CatExEqualsHash("Nija",2);
		
		
		
			System.out.println(obj1.equals(obj2));
		
		

		CatExEqualsHash obj3= new CatExEqualsHash( "Binoy",3);
		CatExEqualsHash obj4= new CatExEqualsHash(" Alfie",4);
		
		
	
			System.out.println(obj3.equals(obj4));
	
		
		

	}

}
