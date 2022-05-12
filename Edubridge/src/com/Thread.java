package com;

public class Thread extends Thread  {
				
					public void run() 
					{
						synchronized (Lock1) 
						{
							System.out.println("Thread 1: Holding lock 1...");
							try 
							{ 
								Thread.sleep(2000); 
							}
							}
					}
				
							catch (InterruptedException e) 
							{
								
							}
							System.out.println("Thread 1: Waiting for lock 2...");
							synchronized (Lock2)
							{

							class ThreadDemo2 extends Thread 
								{
									public void run() 
									{
										synchronized (Lock2)
										{
											System.out.println("Thread 2: Holding lock 2...");
											try 
											{ 
												Thread.sleep(2000); 
											}
										
									
									
											catch (InterruptedException e)
											{
												
											}
											System.out.println("Thread 2: Waiting for lock 1...");
											synchronized (Lock1) {
												System.out.println("XXXX Thread 2: Holding lock 1 & 2...");
											}
										}
									}
								}
							

							