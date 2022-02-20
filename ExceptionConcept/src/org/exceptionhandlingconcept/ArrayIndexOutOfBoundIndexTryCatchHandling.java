package org.exceptionhandlingconcept;
//create project package class and main method
//since we are going to see exception handling in Array Index Out Of Bound exception 
//from the name itself it is array that input means array programms 
//so give the array syntax 

//select the exception thrown program line 
//rightclick -sorround with-Try/Catch block
//the following line will be displayed
//try {
//	int a [] = new int [2];
//	a[0]=999;
//	a[1]=77;
//	System.out.println(a[2]);
//} catch (Exception e) {
//	e.printStackTrace();
//}
// hide the line 	e.printStackTrace();
//type System.err.println("Array Index Out Of Bound Index");
//type finally ctrl+space
//finally - weather the exception occurs or not the finally block will be executed automatically at the time itself
public class ArrayIndexOutOfBoundIndexTryCatchHandling {
	public static void main(String[] args) {
		try {
			int a [] = new int [2];
			a[0]=999;
			a[1]=77;


			System.out.println(a[2]);
		} catch (Exception e) {
			System.err.println("Array Index Out Of Bound Index");
//			e.printStackTrace();
		}
		finally {
			System.out.println("selenium");
		}
}
}
