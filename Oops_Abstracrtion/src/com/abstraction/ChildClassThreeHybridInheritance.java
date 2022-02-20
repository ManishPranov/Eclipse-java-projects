package com.abstraction;
//create new class 
//and using implements keyword override  ChildClassOneHybridInheritance, ChildClassTwoHybridInheritance
//click the error and override default values as follows
public class ChildClassThreeHybridInheritance implements ChildClassOneHybridInheritance, ChildClassTwoHybridInheritance {

	@Override
	public void organisationName() {
		System.out.println("Tata");

	}

	@Override
	public void organisationId() {
		System.out.println(007);

	}

	@Override
	public void studentName() {
		System.out.println("Sam");

	}

	@Override
	public void studentId() {
		System.out.println(900);

	}

	public void companyName() {
		System.out.println("wibro");

	}

	public void companyId() {
		System.out.println(890);

	}

	@Override
	public void employeeId() {
		
		ChildClassOneHybridInheritance.super.employeeId();
	}

	@Override
	public void employeename() {
		
		ChildClassTwoHybridInheritance.super.employeename();
	}

	public static void main(String[] args) {
		ChildClassThreeHybridInheritance s = new ChildClassThreeHybridInheritance();
		s.employeename();
		s.employeeId();
		s.organisationName();
		s.organisationId();
		s.studentName();
		s.studentId();
		s.companyName();
		s.companyId();
	}

}
