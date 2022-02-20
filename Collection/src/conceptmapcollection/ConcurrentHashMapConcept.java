package conceptmapcollection;
//concurrent hash map doesnt allow null values
//Allows two different data types like integer and arraypackage conceptmapcollection;
//create project package class main method
//type the syntax of the map
//	Map<Key,Value> refName = new TypesOfMap<Key,Value > ();
//import the following two lines
//import java.util.LinkedHashMap;
//import java.util.Map;

import java.util.Collection; 
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapConcept {
	public static void main(String[] args) {
		Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();
//		methods of map
		// first method put()
//		helps to get the values
		m.put(1, "One");
		m.put(2, "Two");
		m.put(1, "Java");
		m.put(4, "Five");

		System.out.println(m);

		// second method is the size() used to find the size of map
		int a = m.size();
		System.out.println(a);

		// third method is the get() where size number is given to get the values
		String b = m.get(2);
		System.out.println(b);

		// fourth method is the keyset is given to get the input given in key
		// (import java.util.Set;)will be imported when we use this method
		Set<Integer> c = m.keySet();
		System.out.println(c);

		// fifth method is the values is given to get the input given in values
		// (import java.util.Collection;)will be imported while using this method
		Collection<String> d = m.values();
		System.out.println(d);

		// sixth method is the containskey() where key input is given to cross check
		boolean e = m.containsKey(2);
		System.out.println();

		// seventh method is the containsvalue() where value input is given to cross
		// check
		boolean f = m.containsValue("One");
		System.out.println(f);

		// eighth method is the entryset() is similar to put of but printed inside
		// square bracket
		// (import java.util.Map.Entry;) will be imported when we use this method
		Set<Entry<Integer, String>> g = m.entrySet();
		System.out.println(g);

	}

}
