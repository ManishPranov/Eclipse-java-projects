package com.abstraction;
//create new interface and using extends key word override ParentClassHybridInheritance
//while overriding the methods are taken as default as follows
//also create methods for this interface as follows

public interface ChildClassTwoHybridInheritance extends ParentClassHybridInheritance {
@Override
public default void employeename() {
	System.out.println("Raj");

	
}
@Override
	public default void employeeId() {
	
	System.out.println(789);	
	}
void organisationName();
void organisationId();

}
