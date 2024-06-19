package com.assignment.task;

public class ThreadRunner implements Runnable {

	@Override
	public void run() {
		try {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is processing");
			Thread.sleep((long) (Math.random() * 1000));
			System.out.println(threadName + " has finished processing");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}
	

}
