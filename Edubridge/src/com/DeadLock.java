package com;
import java.io.*;
import java.util.*;
public class DeadLock extends Thread  {

	// Java program to illustrate Deadlock
	// where deadlock is pevented from occuring

	// Importing required packages
	

	// Class 1
	// Helper class
	/*class C extends Thread {

		// Creating object of type class A
		A a = new A();

		// Creating object of type class B
		B b = new B();

		// Method 1
		public void m1()
		{

			// Starting the thread
			this.start();

			// Calling d1 method of class A
			a.d1(b);
		}

		private void start() {
			// TODO Auto-generated method stub
			
		}

		// Method 2
		// run() method for the thread
		public void run()
		{

			// Calling d2 method of class B
			b.d2(a);
		}

		// Method 3
		// Main driver method
		public static void main(String[] args)
		{

			// Creating object of this class
			C deadlock = new C();

			// Calling m1 method
			deadlock.m1();
		}
	}
}
	class A {

		// Method 1 of this class
		// Synchronized method
		public synchronized void last()
		{

			// Print and display statement
			System.out.println("Inside A, last() method");
		}

		// Method 2 of this class
		// Synchronized method
		public synchronized void d1(B b)
		{
			System.out.println(
				"Thread1 start execution of d1() method");

			// Try block to check for exceptions
			try {

				// Putting the current thread to sleep for
				// specific time using sleep() method
				Thread.sleep(2000);
			}

			// Catch block to handle the exceptions
			catch (InterruptedException e) {
				// Display the exception on the console
				System.out.println(e);
			}

			// Display statement
			System.out.println(
				"Thread trying to call B's last() method");

			// Calling the method 1 of this class as created
			// above
			b.last();
		}
	}

	// Class 2
	// Helper class B
	class B {

		// Method 1 of this class
		public void last()
		{

			// Display statement only
			System.out.println("Inside B, last() method");
		}

		// Method 2 of this class
		// Non-synchronized the method d2
		public void d2(A a)
		{

			// Display message only
			System.out.println(
				"Thread2 start execution of d2() method");

			// Try block to check for exceptions
			try {

				// Putting the current thread to sleep for
				// certain time using sleep() method
				Thread.sleep(2000);

				// Catch block to handle the exceptions
			}
			catch (InterruptedException e) {

				// Display the exception on the console
				System.out.println(e);
			}

			// Display message only
			System.out.println(
				"Thread2 trying to call A's last method");

			// Again calling the last() method inside this class
			a.last();
		}
	}

	// Class 3
	// Main class
	// Deadlock class which is extending Thread class
	
*/
	// Java program to illustrate Deadlock
	// in multithreading.
	class Util
	{
		// Util class to sleep a thread
		static void sleep(long millis)
		{
			try
			{
				Thread.sleep(millis);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	// This class is shared by both threads
	class Shared
	{
		// first synchronized method
		synchronized void test1(Shared s2)
		{
			System.out.println("test1-begin");
			Util.sleep(1000);

			// taking object lock of s2 enters
			// into test2 method
			s2.test2();
			System.out.println("test1-end");
		}

		// second synchronized method
		synchronized void test2()
		{
			System.out.println("test2-begin");
			Util.sleep(1000);
			// taking object lock of s1 enters
			// into test1 method
			System.out.println("test2-end");
		}
	}


	class Thread1 extends Thread
	{
		private Shared s1;
		private Shared s2;

		// constructor to initialize fields
		public Thread1(Shared s1, Shared s2)
		{
			this.s1 = s1;
			this.s2 = s2;
		}

		// run method to start a thread
		@Override
		public void run()
		{
			// taking object lock of s1 enters
			// into test1 method
			s1.test1(s2);
		}
	}


	class Thread2 extends Thread
	{
		private Shared s1;
		private Shared s2;

		// constructor to initialize fields
		public Thread2(Shared s1, Shared s2)
		{
			this.s1 = s1;
			this.s2 = s2;
		}

		// run method to start a thread
		@Override
		public void run()
		{
			// taking object lock of s2
			// enters into test2 method
			s2.test1(s1);
		}
	}


	public class Deadlock
	{
		public static void main(String[] args)
		{
			// creating one object
			Shared s1 = new Shared();

			// creating second object
			Shared s2 = new Shared();

			// creating first thread and starting it
			Thread1 t1 = new Thread1(s1, s2);
			t1.start();

			// creating second thread and starting it
			Thread2 t2 = new Thread2(s1, s2);
			t2.start();

			// sleeping main thread
			Util.sleep(2000);
		}
	}//
	public class TestThread {
		public static Object Lock1 = new Object();
		public static Object Lock2 = new Object();
		public static void main(String args[]) {
			ThreadDemo1 T1 = new ThreadDemo1();
			ThreadDemo2 T2 = new ThreadDemo2();
			T1.start();
			T2.start();
		}
		private static class ThreadDemo1 extends Thread {
			public void run() {
			
	public class TestThread {
		public static Object Lock1 = new Object();
		public static Object Lock2 = new Object();
		public static void main(String args[]) {
			ThreadDemo1 T1 = new ThreadDemo1();
			ThreadDemo2 T2 = new ThreadDemo2();
			T1.start();
			T2.start();
		}
		private static class ThreadDemo1 extends Thread {
			public void run() {
				synchronized (Lock1) {
					System.out.println("Thread 1: Holding lock 1...");
					try { Thread.sleep(2000); }
					catch (InterruptedException e) {}
					System.out.println("Thread 1: Waiting for lock 2...");
					synchronized (Lock2) {
						System.out.println("ZZZZZ Thread 1: Holding lock 1 & 2...");
					}
				}
			}
	From Yogesh Gopal Jangle to Everyone 04:27 PM
	private static class ThreadDemo2 extends Thread {
			public void run() {
				synchronized (Lock2) {
					System.out.println("Thread 2: Holding lock 2...");
					try { Thread.sleep(2000); }
					catch (InterruptedException e) {}
					System.out.println("Thread 2: Waiting for lock 1...");
					synchronized (Lock1) {
						System.out.println("XXXX Thread 2: Holding lock 1 & 2...");
					}
				}
			}
		}
	}

