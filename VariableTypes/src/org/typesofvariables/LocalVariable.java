package org.typesofvariables;

//Project Package Class  

public class LocalVariable {

//create different methods like
//	local variable is given inside the method
//	same local variable can be  given inside the other method of the same class	

	public void one() {

		int a = 33;
		int b = 22;
		int c = a + b;
		System.out.println(c);

	}

	public void two() {
		int a = 55;
		int b = 66;
		int c = a + b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		LocalVariable d = new LocalVariable();
		d.one();
		d.two();

	}

}
