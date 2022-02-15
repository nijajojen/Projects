package GenericsDemoss;


// u can use object class or generic class
public class GenDemo1 {

	public static void main(String[] args)throws Exception {
		//A a = new A(10,20);
		GenDemo1 demo= new GenDemo1();
		B<Integer> b= demo.new B<Integer>(23,44);
		b.add(2,3);

	}
	
	/*class A<T>{
		Object x,y;
		A(Object x, Object y){
			this.x=x;
			this.y=y;
			
		}
		void add() {
			//System.out.println(x+y);
		}
		
	}*/
	
	class B<T>{
		T x,y;
		B(T x, T y){
			this.x=x;
			this.y=y;
		}
		void add(T x, T y) {
			System.out.println(x + y);
		}
	}


}
