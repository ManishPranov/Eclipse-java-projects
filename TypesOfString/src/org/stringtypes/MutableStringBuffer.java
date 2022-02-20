package org.stringtypes;
//create project package class main method
public class MutableStringBuffer {
public static void main(String[] args) {
//	stringbuffer syntax
//	StringBuffer variable =  new StringBuffer("");
	StringBuffer a = new StringBuffer("ManishPranov");
	System.out.println(a);
//	system.identityHashCode is used for memory reference
	System.out.println(System.identityHashCode(a));
//	in StringBuffer type duplicate value takes different memory	
	StringBuffer b = new StringBuffer("ManishPranov");
	System.out.println(b);
	System.out.println(System.identityHashCode(b));
//	in StringBuffer instead of concat here append is used
	StringBuffer c = a.append(b);
	System.out.println(c);
//	in StringBuffer type appended string value takes same memory of first string type	
	System.out.println(System.identityHashCode(c));

}
}
