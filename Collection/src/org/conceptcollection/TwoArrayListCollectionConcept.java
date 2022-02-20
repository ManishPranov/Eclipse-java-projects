package org.conceptcollection;

//create project package class and main method

//type the syntax of list collection
//List <WrapperClass> refName = new typesofList<WrapperClass> ();
//the foolowing program is the array list collection so type syntax accordingly
///click the errors and import the following two lines(detail explanations in the MAINmethod)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoArrayListCollectionConcept {
	public static void main(String[] args) {

		// type list ctrl+space select list-java.util
//		the following line will be imported between package and class
//		import java.util.List;
//		complete the syntax of the list and click the error in the program line number
//		and click ImportArrayList(java.util)
//		the following line will be imported between package and class
//	(import java.util.ArrayList;)

		List<Object> z = new ArrayList<Object>();
//copy the syntax and paste in the next line and change the reference name is follows
		List<Object> za = new ArrayList<Object>();

		z.add(77);
		z.add("ManishPranov");
		z.add(77.77);
		z.add('f');

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
