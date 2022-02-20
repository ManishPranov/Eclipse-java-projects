package org.typesofvariables;
//Project Package Class  
public class ClassVariable {
 	
//	class variable - inside the class outside the method as follows
	//initial condition is of class variable is must  
	int a = 100;

	public void add() {
		int b = 50;
//		a class variable can be used with method also 
		int c = a + b;
		System.out.println(c);
	}

	public void addone() {
		int d = 77;
//		a class variable can be used with method also 
		int e = d + a;
		System.out.println(e);

	}

	public static void main(String[] args) {

//		syntax of object as follows
		ClassVariable f = new ClassVariable();
//		condition for class variable to print as follows

	System.out.println(f.a);
		f.add();
		f.addone();

	}

}
