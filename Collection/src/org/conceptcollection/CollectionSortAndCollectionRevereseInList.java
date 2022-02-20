package org.conceptcollection;
//create project package class and main method

//type the syntax of list collection
//List <WrapperClass> refName = new typesofList<WrapperClass> ();
//the following program is the array list collection so type syntax accordingly
///click the errors and import the following two lines(detail explanations in the MAINmethod)



import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class CollectionSortAndCollectionRevereseInList {
	public static void main(String[] args) {
		List<Integer>m = new ArrayList<Integer>();	
		// type list ctrl+space select list-java.util
//		the following line will be imported between package and class
//		import java.util.List;
//		complete the syntax of the list and click the error in the program line number
//		and click ImportArrayList(java.util)
//		the following line will be imported between package and class
//	(import java.util.ArrayList;)

		
		
//		methods of list
//		first method add();
//			using add we give values like an array as follows
	m.add(100);
	m.add(80);
	m.add(75);
	m.add(105);
	m.add(98);

	
	
	
//	Collections.sort is used to print the above values in ascending orders(lower to higher values)
// also line (import java.util.Collections;) is imported between class and method
	Collections.sort(m);
	System.out.println(m);
	
//	Collections.reverse is used to print the above values in descending orders(higher to lower values)	
	Collections.reverse(m);
	System.out.println(m);
	
	
	
	
	
	
	
	
	
	
	
	}

}
