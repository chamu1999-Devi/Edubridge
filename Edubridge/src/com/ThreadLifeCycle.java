package com;
import java.lang.Thread;
public class ThreadLifeCycle extends Thread{

	
		
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println("i="+i);
				}
			}
		
		
		
			public static void main(String args[])
			{
				ThreadLifeCycle  obj=new ThreadLifeCycle ();
				obj.start();
			}
		}

	
