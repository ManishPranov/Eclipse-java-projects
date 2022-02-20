// tree map doesnt allow null values
//doesnt take two different data types like integer and array
package conceptmapcollection;
//create project package class main method

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapConcept {
	public static void main(String[] args) {
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

//	methods of map
		// first method put()
//	helps to get the values
		m.put(1, 90);
		m.put(2, 99);
		m.put(1, 92);
		m.put(4, 91);
		System.out.println(m);

		// second method is the size() used to find the size of map
		int a = m.size();
		System.out.println(a);

		// third method is the get() where size number is given to get the values
		Integer b = m.get(2);
		System.out.println(b);

		// fourth method is the keyset is given to get the input given in key
		// (import java.util.Set;)will be imported when we use this method
		Set<Integer> c = m.keySet();
		System.out.println(c);

		// fifth method is the values is given to get the input given in values
		// (import java.util.Collection;)will be imported while using this method
		Collection<Integer> d = m.values();
		System.out.println(d);

		// sixth method is the containskey() where key input is given to cross check
		boolean e = m.containsKey(2);
		System.out.println();

		// seventh method is the containsvalue() where value input is given to cross
		// check
		boolean f = m.containsValue(95);
		System.out.println(f);

		// eighth method is the entryset() is similar to put of but printed inside
		// square bracket
		// (import java.util.Map.Entry;) will be imported when we use this method
		Set<Entry<Integer, Integer>> g = m.entrySet();
		System.out.println(g);

	}
}
