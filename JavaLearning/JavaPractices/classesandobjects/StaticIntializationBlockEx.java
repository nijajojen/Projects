package classesandobjects;

public class StaticIntializationBlockEx {

	int k;
	static int i=10;  
    static  
    {  
    	System.out.println(i);
        i=20;  
    }  
    static void print()  
    {  
        System.out.println(i);  
    }  
    public static void main(String[] args)  
    {  System.out.println("entered in main class");
        print();  
        i=200;  
        print();  
    }  

}
