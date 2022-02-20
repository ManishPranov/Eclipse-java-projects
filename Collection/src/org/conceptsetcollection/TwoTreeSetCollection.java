package org.conceptsetcollection;
//create project package class and main method

//type the syntax of set collection

//Set <WrapperClass> refName = new typesofset<WrapperClass> ();
//the following program is HashSet collection so type syntax accordingly
///click the errors and import the following two lines(detail explanations in the MAINmethod)

import java.util.Set;
import java.util.TreeSet;
//TreeSet : 
//It Prints in Ascending Order.
//It will not allow Duplicate Values.
//It will not allow even Single null value .

public class TwoTreeSetCollection {
	public static void main(String[] args) {
		Set<Object> z = new TreeSet<Object>();
		Set<Object> za = new TreeSet<Object>();
		// type set ctrl+space select set-java.util
//		the following line will be imported between package and class
//		import java.util.set;
//		complete the syntax of the set and click the error in the program line number
//		and click TreeSet(java.util)
//		the following line will be imported between package and class
//	(import java.util.TreeHashSet;)
//		similarly provide second set syntax
//	methods of set
//	first method add();
//		using add we give values like an array as follows
		z.add(112);
		z.add(99);
		z.add(88);
		z.add(77);
	
//here provide second time values of second reference using add
		za.add(103);
		za.add(77);
		za.add(999);
		za.add(1001);
		za.add(1000);

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
