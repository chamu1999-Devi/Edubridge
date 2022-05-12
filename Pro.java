package com;
 
public class Pro extends Thread{                          
	class Buffer extends Thread{
		class Producer extends Thread{
			Pro b;
			public Producer(Pro p){
				this.b = p;
			}
		 
			public void run(){                                           
				System.out.println("Producer start producing...");
				for(int i = 1; i <= 10; i++){
					p.produce(i);
				}
			}
		}
		 
		class Consumer extends Thread{
			Pro b;
			public Consumer(c){
            this.b = c;
			}
		 
			public void run(){
				System.out.println("Consumer start consuming...");
				for(int i = 1; i <= 10; i++){
					 
				}
			}
		}
		 
		public class ProducerConsumerExample {
			public static void main(String args[]){
				//Create Buffer object.
				Pro p = new Pro();
		 
				//creating producer thread.
				Producer p1=new Producer(p);
		 
				
				//creating consumer thread.
				
				Consumer c=new Consumer(c);
				//starting threads.
				p.start();
				c.start();
			}
		}

		
	}
}