package com.assignment.task;

public class ThreadSynchronization {

	public static void main(String[] args){
		Thread t1 = new Thread(new ThreadRunner(), "T1");
		Thread t2 = new Thread(new ThreadRunner(), "T2");
		Thread t3 = new Thread(new ThreadRunner(), "T3");
		Thread t4 = new Thread(new ThreadRunner(), "T4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		Thread t5 = new Thread(new ThreadRunner(), "T5");
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		t5.start();
	}


}
