package org.exceptionhandlingconcept;

public class StringIndexOutOfBoundTryCatch {
	public static void main(String[] args) {
		String a = "WelCome";
//		Giving out of string index valuyes throws String Index Out Of Bound Index Exception
	try {
		char b = a.charAt(9);
		System.out.println(b);
	} catch (Exception e) {
		System.err.println("String Index Out Of Bound exception");
//		e.printStackTrace();
	}
	
	}
}
