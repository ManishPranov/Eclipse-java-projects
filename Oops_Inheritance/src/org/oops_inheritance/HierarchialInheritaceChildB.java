package org.oops_inheritance;

public class HierarchialInheritaceChildB extends MultiLevelInheritance {
	// method1
	// locationName(CAMEL FOR CLASS) ctrl+space
	// change private to public
	public void locatioName() {

		// syso ctrl+ spacebar

		System.out.println("Theni");
	}
	// method2
	// locationId ctrl + spacebar
	// change private to public

	public void locationId() {
		// syso ctrl+ spacebar
		System.out.println("625531");
	}

	// mainmethod

	// main ctrl+spacebar

	public static void main(String[] args) {

		// syntax classname reference name = new classname ();
		// referencename .method1();
		// referencename.method2();
		HierarchialInheritaceChildB hib = new HierarchialInheritaceChildB();
		hib.employeeName();
		hib.employeeId();
		hib.studentName();
		hib.studentId();
		hib.companyName();
		hib.companyId();
		hib.locatioName();
		hib.locationId();
//		 alignment ctrl shift f
//		 run the program
	}

}
