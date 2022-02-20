package org.oops_inheritance;

public class SingleInheritance extends OopsMethodType {

// method1
//	studentName ctrl + spacebar
//change private to public

	public void studentName() {

		// syso ctrl+ spacebar

		System.out.println("Pranov");
	}
//method2
//	studentId ctrl + spacebar
	// change private to public

	public void studentId() {
		// syso ctrl+ spacebar
		System.out.println("100");
	}

	// mainmethod

	// main ctrl+spacebar

	public static void main(String[] args) {

		// syntax classname reference name = new classname ();
//	referencename .method1();
//	referencename.method2();
		SingleInheritance s = new SingleInheritance();
		s.employeeName();
		s.employeeId();
		s.studentName();
		s.studentId();
//		 alignment ctrl shift f
//		 run the program

	}
}
