package org.finalfinallyfinalizeconcept;

//create project package class
public class ConceptFinalize {
//	constructor - class and method names are same
//create two constructor as follows
	public ConceptFinalize() {
//		non parameterized or default constructor
		System.out.println("meow");
	}

	public ConceptFinalize(int a) {
//		parameterized constructor
		System.out.println(a);
	}

	public static void main(String[] args) throws Throwable {
		ConceptFinalize b = new ConceptFinalize();
		ConceptFinalize c = new ConceptFinalize(77);
//		finalize method is used in garbage collection 
//		used to remove unwanted memory
		b.finalize();
//after the above line click the error and select (add throws declaration)
		c.finalize();
	}

}
