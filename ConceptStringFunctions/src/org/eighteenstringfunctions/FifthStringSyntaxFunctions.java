package org.eighteenstringfunctions;
//create project package class main method
public class FifthStringSyntaxFunctions {
	public static void main(String[] args) {
//		create syntax of string
		String a = "Welcome To Java";
//	function 18 split is to split the string values
//		here "" in syntax refers split after space
//		to get the following syntax  type ctrl+2 select ctrl+2+L from the bottom tab
		String[] b = a.split(" ");
//		to get output create for each loop
	for (String a1 : b) {
		System.out.println(a1);
	}
	
	}

}
