package org.typesofvariables;

//Project Package Class  
public class StaticVariable {
//	static variable - inside the class outside the method as follows
//	static word is used before data type and variable as follows  

	static int a = 77;
//	create methods and change private to public
//	add  static between public and void as follows

	public static void one() {
		int b = 12;
		int c = b + a;
		System.out.println(c);

	}

	public static void two() {
		int d = 24;
		int e = d + a;
		System.out.println(e);

	}

	public static void main(String[] args) {
//since we declared the static variable in class and methods 
//		without using the object we call the static variable & static method as follows
		
		System.out.println(a);
		one();
		two();
	}
}
