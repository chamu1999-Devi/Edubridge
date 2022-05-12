package com;

class Producer1 extends Thread{ 
	public void run(){
		System.out.println("Producer start producing...");		
		try {
			wait();
			
		} catch (Exception e) {	}
		for(int i = 1; i <= 2; i++){			
			System.out.println("Producer"+i);			
		}
		System.out.println("Producer after wait");
	}
} 
class Consumer1 extends Thread{ 
	public void run(){
		System.out.println("Consumer start consuming...");
		for(int i = 1; i <= 2; i++){			
			System.out.println("Consumer"+i);			 
		}		
		try {
			notifyAll();			
		} catch (Exception e) {	}	
		System.out.println("Consumer after notify");
	}
}

public class WaitNotify {
	public static void main(String args[]){
		 		
		Producer1 p = new Producer1(); 	
		Consumer1 c = new Consumer1(); 
		//starting threads.
		p.start();
		System.out.println("Thread p is started");
		c.start();
		System.out.println("Thread c is started");
	}
}
