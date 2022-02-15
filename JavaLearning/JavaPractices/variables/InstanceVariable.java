package variables;

public class InstanceVariable {

	
	//instance variable is visible for any child class
	String name;
	//salary  variable is visible in Employee class only.
	private double salary;
	
	
	public InstanceVariable(String newName) {
		name= newName;
	}
	
	public void setSalary (double slry) {
		salary= slry;
	}
	
	public void printSalary() {
		System.out.println(salary);
	}
	
	
		
	public static void main(String[] args) {
		InstanceVariable instVar= new InstanceVariable("Nija");
		instVar.setSalary(100.12);
		instVar.printSalary();
		
	}

}
