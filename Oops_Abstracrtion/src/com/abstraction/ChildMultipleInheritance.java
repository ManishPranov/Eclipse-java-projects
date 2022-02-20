package com.abstraction;
//use implement key word to call two parent interface class using comma(,) in multiple inheritance
//after typing click error in the line and click add the unimplemented method
//the methods will be displayed in the format of
/* @Override
 * public void method() {
 * }
 */
//type syso ctrl + space to get
/*System.out.println();
 * type the values inside the brackets
*/
public class ChildMultipleInheritance implements FatherMultipleInheritance,MotherMultipleInheritance {

	@Override
	public void employeeName() {
		System.out.println("raj");
		
	}

	@Override
	public void employeeId() {
		System.out.println("678");
		
	}

	@Override
	public void studentname() {
		System.out.println("mohan");
		
	}

	@Override
	public void studentmark() {
	System.out.println("99");
		
	}
//	main ctrl+space  to create main method
//	create syntax of methods and run the program
	public static void main(String[] args) {
		ChildMultipleInheritance v = new ChildMultipleInheritance();
		v.employeeName();
		v.employeeId();
		v.studentname();
		v.studentmark();
	}

}
