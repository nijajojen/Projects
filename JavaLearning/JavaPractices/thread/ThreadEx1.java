package thread;

public class ThreadEx1 implements Runnable {
	
	private String threadName;
	private Thread t;
	
	ThreadEx1(String threadName){
		this.threadName= threadName;
		System.out.println("thread name is: "+this.threadName);
	}
	
	@Override
	public void run() {
		System.out.println("running: "+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("thread:"+threadName+","+i);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread:"+threadName+"interrupted");
		}
		
	}
	
	public void startEx() {
		System.out.println("starting "+threadName);
		if(t==null) {
			t= new Thread(this,threadName);
			t.start();
		}
	}

}
