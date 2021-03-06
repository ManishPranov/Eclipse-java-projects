package org.stringtypes;

//create project package class main method
public class MutableStringBuilder {
	public static void main(String[] args) {
//		stringBuilder syntax
//		StringBuilder variable =  new StringBuilder("");
		StringBuilder a = new StringBuilder("ManishPranov");
		System.out.println(a);
//		system.identityHashCode is used for memory reference
		System.out.println(System.identityHashCode(a));
//		in StringBuilder type duplicate value takes different memory	
		StringBuilder b = new StringBuilder("ManishPranov");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
//		in StringBuilder instead of concat here append is used
		StringBuilder c = a.append(b);
		System.out.println(c);
//		in StringBuilder type appended string value takes same memory of first string type	
		System.out.println(System.identityHashCode(c));

	}

}
