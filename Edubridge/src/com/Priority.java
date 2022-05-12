package com;

public class Priority {
	public class myNewThread extends Thread {

		public static void main(String[] args) {
			
			
			Priority m0 = new Priority();		
			m0.Priority(MAX_PRIORITY);// 10
			
			m0.start(); // calls run()
			
			m0.mymethod();
					
			for(int i = 0; i < 20; i++ ) {
			//System.out.println( "mo="+m0.getState()+"..m1.."+m1.getState()+"..m2.."+m2.getState()  );
			}

		}
		
	public void run() {
			
			for(int i = 0; i < 20; i++ ) {
			//System.out.println(Thread.currentThread().getName()+"=thread name"  );
			}		
			myNewThread my = new myNewThread();
			my.mymethod();
				}
		
		public void mymethod() {
			
			System.out.println(Thread.currentThread().getName()+"=XXthread nameXX"+Thread.currentThread().getPriority()  );
			
		}

	}

	public void Priority(int maxPriority) {
		// TODO Auto-generated method stub
		
	}

	public void mymethod() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
