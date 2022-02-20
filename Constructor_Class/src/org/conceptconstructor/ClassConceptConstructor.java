package org.conceptconstructor;

//create project,package,class
public class ClassConceptConstructor {
//if methods and class names should be same we use constructor
//	after creating class type method name same as class name type ctrl+c 
//	there will be no return type (void) in the method
	public ClassConceptConstructor() {
//		the above constructor is non parameterized constructor
		System.out.println("Manish");

	}

	public ClassConceptConstructor(int id) {

//		the above constructor parameterized constructor
//		to get more than one constructor we need to copy and paste
//		we can't type second constructor and get them

		System.out.println(id);

	}

	public void employeeSalary() {

		System.out.println("80k");

	}

	public void pinCode(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
//		provide syntax of oops
//		here the syntax first line takes the constructor value

		ClassConceptConstructor o = new ClassConceptConstructor();

//		if more than one constructor class is provided 
//		then provide syntax of oops with new reference value
		ClassConceptConstructor o1 = new ClassConceptConstructor(99);
		o.employeeSalary();
		o.pinCode(625531);
//		

}

}
