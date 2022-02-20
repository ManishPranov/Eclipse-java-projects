package org.stringtypes;

//create project package class 
public class ImmutableStringType {
	public static void main(String[] args) {
//	string syntax
//	String variable = "group of values"

		String a = "ManishPranov";
		System.out.println(a);
//	system.identityHashCode is used for memory reference
		System.out.println(System.identityHashCode(a));
//	in string immutable type duplicate value takes same memory	
		String b = "ManishPranov";
		System.out.println(b);
		System.out.println(System.identityHashCode(b));

//	in string immutable type concat is used 
//	but output takes different memory
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(System.identityHashCode(c));

	}
}
