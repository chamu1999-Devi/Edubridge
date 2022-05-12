package com;
import java.util.*;

public class Multithreading extends Thread
{


	

		public static void main(String[] args) {
			
			Multithreading m0 = new Multithreading();
			Multithreading m1 = new Multithreading();
			Multithreading m2 = new Multithreading();
			
			m0.setPriority(MAX_PRIORITY);// 10
			m1.setPriority(NORM_PRIORITY);// 5
			m2.setPriority(MIN_PRIORITY);// 1
			
			System.out.println( "mo="+m0.getPriority()+"..m1.."+m1.getPriority()+"..m2.."+m2.getPriority()  );
			
			m0.start(); // calls run()
			m1.start();
			m2.start();
			//m2.mymethod();
					
			for(int i = 0; i < 20; i++ ) {
			System.out.println( "mo="+m0.getState()+"..m1.."+m1.getState()+"..m2.."+m2.getState()  );
			}
		}
		
		public void run() {
			
			for(int i = 0; i < 20; i++ ) {
			System.out.println(Thread.currentThread().getName()+"=thread name"  );
			}		
			//myThread my = new myThread();
			//my.mymethod();
				}
		
		//public void mymethod() {
			
		//	System.out.println("my method"  );
		//	System.out.println(Thread.currentThread().getName()+"=thread name"  );
			
		//}

	}
