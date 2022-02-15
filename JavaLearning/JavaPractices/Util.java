
public class Util {
	
	private static Resource resource;
	
	static {
		resource= new Resource();
	}
	
	public static Resource getObject() {
		return resource;
	}

}
