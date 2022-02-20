package org.oops_inheritance;

public class HierarchialInheritanceChildA extends MultiLevelInheritance {
	  // method1
		// organisationName(CAMEL FOR CLASS) ctrl+space
		// change private to public
	public void organisationName() {
		
		// syso ctrl+ spacebar

				System.out.println("AMP");
	}
	//method2
	//organisationId ctrl + spacebar
	// change private to public

	public void organisationId() {
		// syso ctrl+ spacebar
		System.out.println("777");
	}

	// mainmethod

	// main ctrl+spacebar

	public static void main(String[] args) {

		// syntax classname reference name = new classname ();
	//referencename .method1();
	//referencename.method2();
		 HierarchialInheritanceChildA hii = new  HierarchialInheritanceChildA();
		hii.employeeName();
		hii.employeeId();
		hii.studentName();
		hii.studentId();
		hii.companyName();
		hii.companyId();
		hii.organisationName();
		hii.organisationId();
//		 alignment ctrl shift f
//		 run the program
	}
}
