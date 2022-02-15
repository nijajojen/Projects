package com.nija;


public class RunnableDemo implements Runnable{

	Thread t;
	String threadName;
		public RunnableDemo(String name) {
		threadName=name;
		
		}
	
	public void run() {
		System.out.println("thread "+ threadName+" is running");
		try {
			for(int i=0;i<4;i++) {
				System.out.println("thread "+ threadName +" "+ i);
				Thread.sleep(50);
				
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		 System.out.println("Thread " +  threadName + " exiting.");
	}
	
	
	
	public void start() {
		if (t== null) {
			t= new Thread(this, threadName);
			t.start();// is this start method is same as the above one?
		}
	}

	

}

