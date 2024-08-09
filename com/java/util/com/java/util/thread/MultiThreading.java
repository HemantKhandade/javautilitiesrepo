package com.java.util.thread;

public class MultiThreading extends Thread{

	public MultiThreading(String threadName) {
		super(threadName);
		//setName(threadName);
	}

	@Override
	public void run() {
		
			System.out.println("get connection from connection pool" + getName());
		
	}

}
