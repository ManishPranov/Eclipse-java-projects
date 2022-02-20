package org.conceptsetcollection;
//create project package class and main method

//type the syntax of set collection

//Set <WrapperClass> refName = new typesofset<WrapperClass> ();
//the following program is HashSet collection so type syntax accordingly
///click the errors and import the following two lines(detail explanations in the MAINmethod)

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
	public static void main(String[] args) {
		Set<Object> z = new HashSet<Object>();
		// type set ctrl+space select set-java.util
//		the following line will be imported between package and class
//		import java.util.set;
//		complete the syntax of the list and click the error in the program line number
//		and click HashSet(java.util)
//		the following line will be imported between package and class
//	(import java.util.HashSet;)

//		methods of set
//		first method add();
//			using add we give values like an array as follows
		z.add(77);
		z.add("ManishPranov");
		z.add(77.77);
		z.add('f');
		System.out.println(z);

		// before we get into other methods to print the values in the line
//		we go to for loop or for each loop
//	for (int i = 0; i < z.size(); i++) {
//		System.out.println(z.get(i));
//		}
		for (Object c : z) {
			System.out.println(c);
		}

//	second method is z.contains(o)
//		in the place of o give the value to be checked whether if it is present in the given values
//		so its a boolean and output will be true or false
		boolean f = z.contains(77);
		System.out.println(f);

//		third method is 	z.clear();
//		helps to clear all the given values and the output will be array[]
		z.clear();
		System.out.println(z);

	}

}
