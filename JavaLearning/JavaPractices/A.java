
public class A {
	
	Resource resource= Util.getObject();
	void calling1() {
		resource.callme();
	}
	
	void calling2() {
		resource.callme();
		}
}
