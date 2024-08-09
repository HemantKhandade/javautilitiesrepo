package com.java.util.thread;

public class ThreadClientClass {

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreading myThreadClass = new MultiThreading("Thread 1");
		myThreadClass.run(); //starts in the main thread itself. does not start a separate thread
		
		myThreadClass.start();
		
		//second copy of my thread
		MultiThreading myThreadClass2 = new MultiThreading("Thread 2");
		myThreadClass2.start();
		
		myThreadClass.join();
		System.out.println("Back to main thread");
	}

}
