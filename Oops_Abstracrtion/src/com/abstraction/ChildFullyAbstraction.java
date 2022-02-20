package com.abstraction;

//use implement keywords in the class to call the interface class
//click the error click the unimplemented methods in the tabs shown by error
//type syso + ctrl +space 
//provide the values inside the braces
public class ChildFullyAbstraction implements ParentFullyAbstraction {

	@Override
	public void employeeName() {
		System.out.println("Pranov");

	}

	@Override
	public void employeeId() {
		System.out.println("123");

	}

//	create main method 
//	syntax of oops and call all the method
	public static void main(String[] args) {
		ChildFullyAbstraction e = new ChildFullyAbstraction();
		e.employeeName();
		e.employeeId();
	}

}
