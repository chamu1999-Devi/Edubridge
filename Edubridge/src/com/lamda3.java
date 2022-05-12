package com;

public class lamda3 {
	interface MyString {

		String run (String string1 );
		
	}
	public class MyLambdaInterface {

		public static void main(String[] args) {
			
			MyString exclaim = (s) -> s + "@";
			MyString ask = (s) -> s + "@";
		    printFormatted("Hello", exclaim);
		   printFormatted("Hello", ask);
		   //exclaim.foreach(f -> {System.out.println(f)});
		   
		}	
		public static void printFormatted(String str, MyString format) {
		    String result = format.run(str);
		    System.out.println(result);
		  }
	}

}
