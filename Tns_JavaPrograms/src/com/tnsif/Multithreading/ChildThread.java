package com.tnsif.Multithreading;

public class ChildThread extends Thread {
	private int n;
	private String msg;
	
	public ChildThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}
	@Override
	 public void run() {
		for(int i=0;i<=n;i++) {
		 try {
			 Thread.sleep(200);
		 }
		 catch(InterruptedException e) {
			 System.err.println("Thread Interrupted:");
		 }
		 System.out.println(msg + i +" "+ Thread.currentThread().getName());
	 }}
		
	 

}
