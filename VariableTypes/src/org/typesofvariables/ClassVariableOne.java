package org.typesofvariables;

public class ClassVariableOne extends ClassVariable {
//	a class variable can be imported from one class to other class 
//	extends keyword
	public void addtwo() {
	int g =  88;
	int h = g+a;
	System.out.println(h);

	}
	
	public static void main(String[] args) {
//		provide object syntax
		ClassVariableOne i = new ClassVariableOne();
//		condition for class variable to print as follows
		System.out.println(i.a);
		i.add();
		i.addone();
		i.addtwo();

	}
	

}
