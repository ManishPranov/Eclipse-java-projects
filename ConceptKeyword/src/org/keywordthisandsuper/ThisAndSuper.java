package org.keywordthisandsuper;

public class ThisAndSuper extends ParentSuperClass {
//	class variable 
	int a = 200;

	public void keywords() {
//	local variable 
		int a = 799;
		int b = 300 + a;
		int c = 500 + this.a;
		int d = 345 + super.a;
//	to print local variable default value is taken to print as follows
		System.out.println(a);

//	to print class variable "this" keyword is used as follows
		System.out.println(this.a); // current class reference

//	to print parent super class "super" keyword is used
		System.out.println(super.a);// parent super class reference

		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
	}

	public static void main(String[] args) {
		ThisAndSuper ts = new ThisAndSuper();
		ts.keywords();
	}

}
