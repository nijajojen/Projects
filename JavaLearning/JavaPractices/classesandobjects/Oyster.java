package classesandobjects;

public class Oyster {

	   public void testfunc(){

	      class A{
	         private String s="A";
	         public String getA(){
	            return s;
	         }
	      }

	      {
	         class B{
	            private String s="B";
	            public String getB(){
	               return s;
	            }
	         }

	         B b=new B();
	         System.out.println(b.getB());
	      }

	      A a=new A();
	      System.out.println(a.getA());
	   }
	   public static void main(String[] args) {
	      Oyster os=new Oyster();
	      os.testfunc();
	   }
	}