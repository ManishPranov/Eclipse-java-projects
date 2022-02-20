package org.finalfinallyfinalizeconcept;
//create project package class
//here keyword "final" is used in class level,method and variable
//final class can not be extended as follows

public final class ConceptFinal {

	//	class variable - inside the class outside the method as follows
	// initial condition is of class variable is must
	// final variable can not changed as above
	final int a = 100;

	// final method can not be extended as follows
	public final void add() {
		int b = 50;

		//		a class variable can be used with method also 
		int c = a + b;
		System.out.println(c);
	}

	public final void addone() {
		int d = 77;

		//		a class variable can be used with method also 
		int e = d + a;
		System.out.println(e);

	}

	public static void main(String[] args) {

//		syntax of object as follows
		ConceptFinal f = new ConceptFinal();
//		condition for class variable to print as follows

		System.out.println(f.a);
		f.add();
		f.addone();
	}
}
