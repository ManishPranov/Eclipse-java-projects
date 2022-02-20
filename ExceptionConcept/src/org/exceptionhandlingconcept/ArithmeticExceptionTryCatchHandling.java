package org.exceptionhandlingconcept;
//create project package class and main method
public class ArithmeticExceptionTryCatchHandling {
	public static void main(String[] args) {
         int b =100;
		System.out.println(b);
//		generally a/0 is infinity
//		but in programming it is not possible
//		so it throws arithmetic exception
//		once exception is thrown the line after exception is not printed

//		select the exception thrown program line 
//		rightclick -sorround with-Try/Catch block
//		the following line will be displayed
//		try {
//			int a = 50;
//System.out.println(a/0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//hide this line e.printStackTrace();
//		type System.err.println()
//		inside () give what type of exception it is as follows
//		System.err.println("Arithmetic Exception");
		
		
		try {
			int a = 50;
System.out.println(a/0);
		} catch (Exception e) {
			System.err.println("Arithmetic Exception");
//			e.printStackTrace();
		}

	
		  int c =10001;
			System.out.println(c);

	}


}
