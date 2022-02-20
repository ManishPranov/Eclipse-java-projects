//question:
//Create program for the following string
//"what you think what you become"
//and the output should be as follows
//what= 2
//you=2
package org.programcollection;

//create project package class and main method
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedProgramCollection {
	public static void main(String[] args) {
//for the given string give the string syntax as follows
//			String reference name = "given string";
		String a = "what you think what you become";
//		after deriving string syntax bring them in array values using array split syntax 
//reference name.split(" ") ctrl+2+l as follows
		String[] b = a.split(" ");

//		since there is only keys and no values as per given question to bring them in collection
//		create map syntax
//		Map<keys,Values>reference name = new types of map<keys,Values>();
//		also the following two lines will be imported
//		import java.util.HashMap; 
//		import java.util.Map;
		Map<String, Integer> c = new HashMap<String, Integer>();

//		to print the values in map first we create foreach loop as follows
		for (String d : b) {
//			secondly if loop with condition using method "contains key" is used as follows
			if (c.containsKey(d)) {
//				thirdly we need to assingn values to the "get" 
//				we get the following syntax
				Integer e = c.get(d);

//				to get next values i.e 1,2,3,4 we use put as follows
				c.put(d, e + 1);


			} else {
//				as a fourth condition we use else with following put condition
				c.put(d, 1);

			}
		}
//		fifth condition  method entry set with following syntax is used 
//		to bring the maps in set
		Set<Entry<String, Integer>> f = c.entrySet();

//		sixth condition to get the output we use for each loop for the above entry set syntax
//		seventh condition if loop with condition having method get value as follows
		for (Entry<String, Integer> g : f) {
			if (g.getValue() > 1) {
				System.out.println(g);
			}
		}

	}
}
