package com.nija;

public class TestThread {

	public static void main(String[] args) {
			RunnableDemo d= new RunnableDemo("firstThread");
			d.start();
			 RunnableDemo r2 = new RunnableDemo( "Thread-2");
		     r2.start();
			
			}
		}

	


