package org.upcastinginjava;
//create an other class inside the same package

//create main method

public class UpcastingInJava {

	public static void main(String[] args) {
//		provide the string syntAX
//		STRING class variable = new string class();
//		but here we use two different class in string syntax as follows
		ParentClassInUpcasting a = new ChildClassInUpcasting();
//	variablename.method namectrl+space
		a.sameMethod();
//run the program 
//	by upcasting we get the output of child class 
	}

}
