package constructor;

public class Parent {
	
	public Parent()
    {
        System.out.println("Parent class no-args"
        		+ " constructor called");
    }
    public Parent(String name)
    {
        System.out.println("Parent class Parameterized constructor"
        		+ " called by "+name);
    }
}
