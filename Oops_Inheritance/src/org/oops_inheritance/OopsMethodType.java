package org.oops_inheritance;

public class OopsMethodType {

	// method1
	// employeeName(CAMEL FOR CLASS) ctrl+space
	// change private to public

	public void employeeName() {

		// syso ctr+spacebar

		System.out.println("Manish");

	}

//	method2
//emplooyeeId	(CAMEL FOR CLASS) ctrl+space
	// change private to public

	public void employeeId() {

		// syso ctr+spacebar
		System.out.println("007");
	}

//	mainmethod
//	main ctrl+ spacebar
	public static void main(String[] args) {

		// syntax for (object / method types/oops)
//		class name  referencename = new classname();
//		referencename.method1();
//		referencename.method2();
		// o= referencename ;
		OopsMethodType o = new OopsMethodType();
		o.employeeName();
		o.employeeId();

		// alignment- ctrl shift f
//		run the program

	}
}
