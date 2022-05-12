package com;

public class  DemonThread  extends Thread{
	

		public static void main(String[] args) {
			
	DemonThread m0 = new DemonThread();
			DemonThread m1 = new DemonThread();
			DemonThread m2 = new DemonThread();
			
			
			m0.start(); // calls run()
					
			m1.start();
					
			m2.start();
			
			for(int i = 0; i < 20; i++ ) {
			System.out.println( "mo="+m0.getState()+"..m1.."+m1.getState()+"..m2.."+m2.getState()  );
			}
		}
		
		public void run() {
			
			for(int i = 0; i < 20; i++ ) {
			System.out.println(Thread.currentThread().getName()+"=thread name"  );
			}
			
		}

		public void add(int a, int b)
		{
			int c=a+b;
			System.out.println("add is"+c);
		}

	}


	


	