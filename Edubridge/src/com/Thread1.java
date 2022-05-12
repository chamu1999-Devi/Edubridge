package com;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {

			 class MainThread {

				 Thread1 p = new Thread1();
		printerOne p1 = new printerOne(p);
		printerTwo p2 = new printerTwo(p);
		printerThree p3 = new printerThree(p);
		printerFour p4 = new printerFour(p);

		p1.start();
		p2.start();
		p3.start();
		p4.start();


		}

		} 

	}

}
