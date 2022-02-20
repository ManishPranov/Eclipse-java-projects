package org.polymorphism;

public class MethodOverLoadingPolymorphism {
//	method over loading (or) compile time (or) static binding polymorphism
// in the same class, methods name are same, different arguments or parameters
//type method ctrl + space
//here sameMethods ctrl +space
//	change private to public
//	provide (datatype and variable) in method
//	datatype here 'int' variable 'a'
	public void sameMethods(int a) {
//	type syso ctrl+space
//provide variable inside the bracket		
		System.out.println(a);
	}

//here sameMethods ctrl +space
//		change private to public
//		provide (datatype and variable) in method
//		datatype "String" variable "a"
	public void sameMethods(String a) {
//	type syso ctrl+space
		// provide variable inside the bracket

		System.out.println(a);
	}
//here sameMethods ctrl +space
//change private to public
//for DATA ORDER provide different data types orderly with variables like int a string b

	public void sameMethods(int a, String b) {
//	type syso ctrl+space
		// provide variable inside the bracket

		System.out.println(a + " " + b);
//	here +" "+ means space
	}

//here sameMethods ctrl +space
//change private to public
//for DATA COUNT provide number of data types like string a string b etc.. or int a int b etc..
	public void sameMethods(String a, String b) {
//	type syso ctrl+space
		// provide variable inside the bracket
		System.out.println(a  + " and " + b);
//	here a+" "+"and "+b means a space and space b
	}

//type main method
//main ctrl+space
	public static void main(String[] args) {
//	provide syntax of an object
//	classname reference name = new classname ();
		MethodOverLoadingPolymorphism molp = new MethodOverLoadingPolymorphism();
//	provide the value of variable inside the bracket in next step
		molp.sameMethods(7);
		molp.sameMethods("Manish");
		molp.sameMethods(77, "Pranov");
		molp.sameMethods("manish", "pranov");
//align the coding by ctrl+shift+f
		
	}

}
