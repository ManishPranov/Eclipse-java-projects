package com.abstraction;

//create project package class and first method like normal procedure

public abstract class ParentPartialAbstraction {
	
	public void studentNAME() {
		System.out.println("Manish");

	}
//	create second method 
//	and this method is the unimplemented method 
//	so change private to abstract 
//	error displays in the method name
//	click the method name in the line 
//	click (remove method body)
//	then move the mouse to the error shown in program line number and single click 
//	select  (make type 'class name' abstract)
//	then class name changes to ( public abstract class) format

	abstract void studentid();
//	create new class to complete this PartialAbstraction TYPE
	

}
