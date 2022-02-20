package org.conceptsetcollection;
//create project package class and main method

//type the syntax of set collection

//Set <WrapperClass> refName = new typesofset<WrapperClass> ();
//the following program is HashSet collection so type syntax accordingly
///click the errors and import the following two lines(detail explanations in the MAINmethod)

import java.util.LinkedHashSet;
import java.util.Set;

public class TwoLinkedHashSetCollection {
	public static void main(String[] args) {
		Set<Object> z = new LinkedHashSet<Object>();
		Set<Object> za = new LinkedHashSet<Object>();

		// type set ctrl+space select set-java.util
//		the following line will be imported between package and class
//		import java.util.set;
//		complete the syntax of the set and click the error in the program line number
//		and click HashSet(java.util)
//		the following line will be imported between package and class
//	(import java.util.LinkedHashSet;)
//		similarly provide second set syntax

//		methods of set
//		first method add();
//			using add we give values like an array as follows
		z.add(77);
		z.add("ManishPranov");
		z.add(77.77);
		z.add('f');
//here provide second time values of second reference using add
		za.add(143);
		za.add("MEOW");
		za.add(25.5);
		za.add('u');
		za.add(77);

//method add all is used to concat two lists
//first reference name .addall
//select reference name.addall(object)boolean
//provide second reference name inside the object
//z.addAll(za);
//System.out.println(z);  

//if two lists having same value to print that samevalues we use retain all
//procedures are same as addall
//z.retainAll(za);
//System.out.println(z);

//to remove the same values in two list we use removeall method
//procedures are same as addall
		z.removeAll(za);
		System.out.println(z);

	}

}
