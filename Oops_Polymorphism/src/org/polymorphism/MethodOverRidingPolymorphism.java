package org.polymorphism;

// different class same method same (augments or parameter) value 
//use "extends" keyword and mention the class to be override in this different class
public class MethodOverRidingPolymorphism extends MethodOverLoadingPolymorphism {
//type the same method to be override and type ctrl+spacebar
//	here sameMethods +ctrl+spacebar
//the following will be displayed
//	@Override 
//	public void sameMethods(int a) {
//	super.sameMethods();
	@Override
public void sameMethods(int a) {
//		next to method line type syso+ctrl+space
//		provide the variable name inside the bracket
	System.out.println(a);
//	in the super keyword line provide the value of variable to be override
//	here it is 7 given in the previous class
	super.sameMethods(7);
}
	//type the same method to be override and type ctrl+spacebar
//	here sameMethods +ctrl+spacebar
//the following will be displayed
//	@Override 
//	public void sameMethods(int a) {
//	super.sameMethods();
@Override
	public void sameMethods(String a) {
//	next to method line type syso+ctrl+space
//	provide the variable name inside the bracket
System.out.println(a);
//in the super keyword line provide the value of variable to be override
//here it is "Manish" given in the previous class

	super.sameMethods("Manish");
	}
//type the same method to be override and type ctrl+spacebar
//here sameMethods +ctrl+spacebar
//the following will be displayed
//@Override 
//public void sameMethods(int a) {
//super.sameMethods();
@Override
	public void sameMethods(int a, String b) {
//	next to method line type syso+ctrl+space
//	provide the variable name inside the bracket
	System.out.println(a+" "+b);
//	//	in the super keyword line provide the value of variable to be override
//	here it is 77,"Pranov" given in the previous class

		super.sameMethods(77, "Pranov");
	}
//type the same method to be override and type ctrl+spacebar
//here sameMethods +ctrl+spacebar
//the following will be displayed
//@Override 
//public void sameMethods(int a) {
//super.sameMethods();
@Override
	public void sameMethods(String a, String b) {
//	next to method line type syso+ctrl+space
//	provide the variable name inside the bracket
		System.out.println(a+" "+"and "+b);
//		in the super keyword line provide the value of variable to be override
//		here it is "manish" "pranov" given in the previous class

		super.sameMethods("manish", "pranov");
	}
//type mainmethod
//main+ctrl+space
public static void main(String[] args) {
//	type syntax of oops
	MethodOverRidingPolymorphism morp =new MethodOverRidingPolymorphism();
//provide the variable values of the methods in this class
	morp.sameMethods(34);
morp.sameMethods("manishpranov");
morp.sameMethods(12, "amp");
morp.sameMethods("net", "flix");
//align the program ctrl +shift+ f

}
}
