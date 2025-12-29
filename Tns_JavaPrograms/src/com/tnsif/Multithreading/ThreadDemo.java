package com.tnsif.Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
    	ChildThread Threadone = new ChildThread(5,"First");
    	ChildThread Threadtwo = new ChildThread(10,"Second");
    	
    	Threadone.start();
    	Threadtwo.start();
    	
    	System.out.println("-------end-------");
    	
    }
}
