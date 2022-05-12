package com;
import java.lang.*;
public class TC implements Runnable{

	public void run()
			{
				
				
				System.out.println("Current thread: "+ Thread.currentThread().getName());

			
				//System.out.println("Is Alive? " + t1.isAlive());
			}
			
			public static void main(String args[]) throws Exception
			{
				
				Thread t1 = new Thread(new TC());
				Thread t2 = new Thread(new TC());
				Thread t3 = new Thread(new TC());
				t1.start();
				t2.start();
				t3.start();
				while(t1.isAlive()||t2.isAlive()||t3.isAlive())
				{
					System.out.println("t1 Is alive? " + t1.isAlive());
					System.out.println("t2 Is alive? " + t2.isAlive());
					System.out.println("t3 Is alive? " + t3.isAlive());
					
				}
				
			}
		}


	
