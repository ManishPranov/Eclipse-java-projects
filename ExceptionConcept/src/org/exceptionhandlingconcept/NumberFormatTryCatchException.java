package org.exceptionhandlingconcept;

public class NumberFormatTryCatchException {
	public static void main(String[] args) {
//		string syntax can print integer values and  string values
			String a = "12345abcdef";
//		giving two integers values using any operator combines two values
//		operation is not performed
			System.out.println(a + 10000);

//			Integer.parseint is used to perform operators of string 
//			containing two integer values
//			but cant perform the operators containing string and integer values
//			so it throws Number Format Exception
			try {
				int b = Integer.parseInt(a);
				System.out.println(b + 10000);
			} catch (NumberFormatException e) {
				System.out.println("Number Format Exception ");
//				e.printStackTrace();
			}
	
	}

}
