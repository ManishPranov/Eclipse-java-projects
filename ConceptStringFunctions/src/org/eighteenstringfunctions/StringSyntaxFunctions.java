package org.eighteenstringfunctions;
//create project package class main method

public class StringSyntaxFunctions {

	public static void main(String[] args) {

		// provide syntax of string
//		String reference name = "within double quotes provide group of letters(values)" 

		String s = "Welcome to Java";

		// function 1 to find number of index values
//		type s.length select from tabs 
//		then type ctrl+2 select ctrl+2+sl
//		then this following syntax will come

		int a = s.length();
		System.out.println(a);

		// function 2 to check with the other string values(with case sesitivity)
//	type s.equals select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come

		boolean b = s.equals("welcome to java");

		// the output will be false
//	because java is case sensitivity
//	"Welcome to Java" is compared with "welcome t0 java"
//	since java is case sensitivity W & J are upper case in given string
//	whereas w & j are lower case in given equals function
		System.out.println(b);

		// function 3 to check with the other string values (without case sensitivity)
//	type s.equalsIgnoreCase select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come

		boolean c = s.equalsIgnoreCase("welcome to java");

		// the output will be true
//	because java ignores case sensitivity
//	"Welcome to Java" is compared with "welcome t0 java"
		System.out.println(c);

		// function 4 to check with string syntax (with case sensitivity)
//	type s.startswith(string prefix) select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come

		boolean d = s.startsWith("we");

//	the output will be false 
//	because java is case sensitivity
//	"Welcome to Java" is compared with "we"
//	since java is case sensitivity W & E are upper case in given string
//	whereas w & e are lower case in given starts with function
		System.out.println(d);

		// function 5 to check with string syntax (with case sensitivity)
//	type s.startswith(string suffix) select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		boolean e = s.endsWith("va");
//	the output will be true
		System.out.println(e);
		// function 6 to convert the string syntax completely to upper case
//	type s.touppercase select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		String f = s.toUpperCase();
		System.out.println(f);

		// function 7 to convert the string syntax completely to lower case
//	type s.tolowercase select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		String g = s.toLowerCase();
		System.out.println(g);

		// function 8 to define the index values of given string
//	type s.charAt(index) select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		char h = s.charAt(5);
		System.out.println(h);

		// function 9 to define the first index value number of given string character
//	type s.indexOf(ch) select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		int i = s.indexOf('e');
		System.out.println(i);

		// function 10 to define the last index value number of given string character
//	type s.lastindexOf(ch) select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		int j = s.lastIndexOf("e");
		System.out.println(j);

		// function 11 to check the given group of values inside the given string values
//	type s.contains select from tabs 
//	then type ctrl+2 select ctrl+2+sl
//	then this following syntax will come
		boolean k = s.contains("come");
		System.out.println(k);
//function 12 to replace the given group of values inside the given string values
//type s.replace select from tabs 
//then type ctrl+2 select ctrl+2+sl
//then this following syntax will come
		String l = s.replace("to", "2");
		System.out.println(l);

		// function 13 to start the given group of values from their index numbers till
		// the rest of values
		// type s.substring(intbeginindex) select from tabs
		// then type ctrl+2 select ctrl+2+sl
		// then this following syntax will come
		String m = s.substring(3);
		System.out.println(m);

		// function 14 to start and end the given group of values from their index
		// numbers
		// type s.subsequence(intbeginindex,intendindex) select from tabs
		// then type ctrl+2 select ctrl+2+sl
		// then this following syntax will come
		CharSequence n = s.subSequence(3, 15);
		System.out.println(n);

	}

}
