package com;

import java.util.ArrayList;
import java.util.Collections;

public class Lamda2 {
	

	
	interface FuncInterface
	{
		
		void abstractFun(int x);

		
		default void normalFun()
		{
		System.out.println("Hello");
		}
	}

	class Test
	{
		public static void main(String args[])
		{
			
			FuncInterface fobj = (int x)->System.out.println(2*x);

			// This calls above lambda expression and prints 10.
			fobj.abstractFun(5);
		}
	}
}
	
