package conceptiteratorandlistiterator;
//project,package,class and main method

//provide list syntax here array list syntax
//import the following two lines between package and class
//import java.util.ArrayList;
//import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorAndIteratorConcept {
	public static void main(String[] args) {
		List<Object> z = new ArrayList<Object>();

//		using add method add the values

		z.add(77);
		z.add("ManishPranov");
		z.add(77.77);
		z.add('f');
		System.out.println(z);

		// referencename.listIterator ctrl+space
//	ctrl+2+l
//		syntax is formed as follows
//		also line "import java.util.ListIterator;" is printed between package and class

		ListIterator<Object> b = z.listIterator();

		// keyeword for list iterator is next
		// referencename.next ctrl+space
//		ctrl+2+l
//			syntax is formed as follows
//first syntax prints first values
		// second syntax prints second values
		// third syntax prints third values
		// fourth syntax prints fourth values
//		Object c = b.next();
//		System.out.println(c);
//
//		Object d = b.next();
//		System.out.println(d);
//
//		Object e = b.next();
//		System.out.println(e);
//
//		Object f = b.next();
//		System.out.println(f);

		// to print the iterator orderly while loop is used as follows
//		condition -hasNext
//		also in syso keyword previous is used

		while (b.hasNext()) {
			System.out.println(b.next());

		}
//		to print the  iterator reversely while loop is used as follows 
//		condition -hasPrevious
//		also in syso keyword previous is used

		while (b.hasPrevious()) {
			System.out.println(b.previous());
		}

		Iterator<Object> c = z.iterator();

		while (c.hasNext()) {
			System.out.println(c.next());

		}

	}

}
