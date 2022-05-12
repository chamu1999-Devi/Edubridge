package com;

import com.sample.ThreadDemo1;
import com.sample.ThreadDemo2;

public class sample1 {

	public  static Object Lock1 = new Object();
	public  static Object Lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		
		
		T1.start();
		try {
			T1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		T2.start();
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				try 
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e) {}
				System.out.println("Thread 2: Waiting for lock 1...");
				synchronized (Lock1) {
					System.out.println("XXXX Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 2...");
				try { Thread.sleep(2000); }
				catch (InterruptedException e) {}
				System.out.println("Thread 1: Waiting for lock 1...");
				synchronized (Lock2) {
					System.out.println("XXXX Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}


}
