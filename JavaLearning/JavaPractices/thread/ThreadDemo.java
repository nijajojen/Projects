package thread;

public class ThreadDemo extends Thread {
	
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	ThreadDemo(String threadName,PrintDemo pd){
		super(threadName);
		this.threadName=threadName;
		this.pd=pd;
		
	}
	
	public void startMine() {		
		if(t==null) {
			System.out.println("starting "+ threadName);
			this.start();
		}
	}
	
	public void run() {
		pd.printCount();
		System.out.println("starting"+ threadName);
	}

	

}
