package variables;

public class InstanceCounter {

	public static int numInstances;
	
	public static int getNumInstances() {
		return numInstances;
	}
	public static void addInstances() {
		numInstances++;
	}
	InstanceCounter(){
		InstanceCounter.addInstances();
	}
	public static void main(String[] args) {
		System.out.println("Initial Counter "+InstanceCounter.getNumInstances());
		for(int i =0; i<50; i++) {
			new InstanceCounter();
		}
		
		System.out.println("final Counter "+getNumInstances());
		
	}

}
