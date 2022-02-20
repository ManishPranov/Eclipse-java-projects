package com.abstraction;

//use extends keyword to call the unimplimented method of different class(here previous class)  
//click the error and click the unimplemented methods
public class ChildPartialAbstraction extends ParentPartialAbstraction {

	@Override
	void studentid() {
		System.out.println("456");

	}

//	create main method
//	syntax of oops
//	for partial abstraction call both parent child methods 
	public static void main(String[] args) {
		ChildPartialAbstraction s = new ChildPartialAbstraction();
		s.studentNAME();
		s.studentid();
	}
}
