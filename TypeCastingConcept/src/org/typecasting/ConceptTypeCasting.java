package org.typecasting;

public class ConceptTypeCasting {
public static void main(String[] args) {
//	two types of type casting 
//	1.widening
//	2.narrowing
//	numerical data types (primitive datatypes) are used in type casting 

	
//	widening
	byte a = 7 ;
//	byte datatype is smaller than short int long float double 
//	so widening typecasting is used as follows
	short b = a;
	System.out.println(b);
	int c = a ;
	System.out.println(c);
	long d = a;
	System.out.println(d); 
	float e = a;
	System.out.println(e);
	double f = a;
	System.out.println(f);
	
//	narrowing
	long g = 77;
//	long datatype is greater than short int long float double datatype
//	so narrowing typecasting is used as follows	
//	click the error and import casting
	int h = (int) g;
	System.out.println(h);
	short i = (short) g;
	System.out.println(i);
	byte j = (byte) g;
	System.out.println(j);
	float k = g ;
	System.out.println(k);
	double l = g;
	System.out.println(l);
}
}
