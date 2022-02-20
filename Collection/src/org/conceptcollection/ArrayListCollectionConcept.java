
package org.conceptcollection;

//create project package class and main method
//type the syntax of list collection
//List <WrapperClass> refName = new typesofList<WrapperClass> ();
//the following program is the array list collection so type syntax accordingly
///click the errors and import the following two lines(detail explanations in the MAINmethod)

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionConcept {
	public static void main(String[] args) {

		// type list ctrl+space select list-java.util
//		the following line will be imported between package and class
//		import java.util.List;
//		complete the syntax of the list and click the error in the program line number
//		and click ImportArrayList(java.util)
//		the following line will be imported between package and class
//	(import java.util.ArrayList;)

		List<Object> z = new ArrayList<Object>();
//	methods of list
//	first method add();
//		using add we give values like an array as follows
		z.add(77);
		z.add("ManishPranov");
		z.add(77.77);
		z.add('f');
		System.out.println(z);

		// second method size (); we get index numbers as follows
		int a = z.size();
		System.out.println(a);

		// third method is get();
//		we get z.get(index)
//		in index give the index number to be printed
		Object b = z.get(1);
		System.out.println(b);

		// before we get into other methods to print the values in the line
//		we go to for loop or for each loop
//	for (int i = 0; i < z.size(); i++) {
//		System.out.println(z.get(i));
//		}
		for (Object c : z) {
			System.out.println(c);
		}

//		third method is z.add(index, element);
//		in index give the index number to be printed
//		in element give the additional vaue to added
		z.add(1, "A");
		System.out.println(z);

//		fourth method is z.set(index, element);
//		in index give the index number to be printed
//		in element give the additional vaue to be replaced
		z.set(1, "DON");
		System.out.println(z);

		// fifth method is z.remove(index)
//		in index give the index number whose value to be removed
		z.remove(1);
		System.out.println(z);

//	sixth method is 	z.indexOf(o)
//	in index of 'o' give the index value whose first index numer to be printed
		int e = z.indexOf(77);
		System.out.println(e);
//	incase if value 77 is again given value 
//	then we use	z.lastindexOf(o)
//	in last index of 'o' give the index value whose last index numer of the same value to be printed

//	seventh method is z.contains(o)
//	in the place of o give the value to be checked whether if it is present in the given values
//	so its a boolean and output will be true or false
		boolean f = z.contains(77);
		System.out.println(f);

//	seventh method is 	z.clear();
//	helps to clear all the given values and the output will be array[]
		z.clear();
		System.out.println(z);

	}

}
