package com.abstraction;
//create new interface and using extends key word override ParentClassHybridInheritance
// while overriding the methods are taken as default as follows
//also create methods for this interface as follows
public interface ChildClassOneHybridInheritance extends ParentClassHybridInheritance {
@Override
default void employeename() {
	System.out.println("Raj");
	
}
@Override
	default void employeeId() {
	System.out.println(789);
		
	}
void studentName();
void studentId();
}
