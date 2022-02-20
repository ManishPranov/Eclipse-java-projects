package org.oops_inheritance;

public class MultiLevelInheritance extends SingleInheritance {
    // method1
	// companyName(CAMEL FOR CLASS) ctrl+space
	// change private to public
public void companyName() {
	
	// syso ctrl+ spacebar

			System.out.println("ManishPranov");
}
//method2
//studentId ctrl + spacebar
// change private to public

public void companyId() {
	// syso ctrl+ spacebar
	System.out.println("107");
}

// mainmethod

// main ctrl+spacebar

public static void main(String[] args) {

	// syntax classname reference name = new classname ();
//referencename .method1();
//referencename.method2();
	MultiLevelInheritance mli = new MultiLevelInheritance();
	mli.employeeName();
	mli.employeeId();
	mli.studentName();
	mli.studentId();
	mli.companyName();
	mli.companyId();
//	 alignment ctrl shift f
//	 run the program
}
}