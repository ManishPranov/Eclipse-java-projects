package org.runtimeoruncheckedexception;
//create project package class and main method

public class IntegerParseIntConcept {
	public static void main(String[] args) {
//	string syntax can print integer values
		String a = "12345";
//	giving two integers values using any operator combines two values
//	operation is not performed
		System.out.println(a + 10000);

//		Integer.parseint is used to perform operators of string containing two integer values
		int b = Integer.parseInt(a);
		System.out.println(b + 10000);
	}
}
