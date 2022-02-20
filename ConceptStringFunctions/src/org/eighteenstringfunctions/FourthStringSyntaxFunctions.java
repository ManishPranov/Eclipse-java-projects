package org.eighteenstringfunctions;

public class FourthStringSyntaxFunctions {
	public static void main(String[] args) {
		String a = ("");
//		function 17 empty is used to check whether the statement is true
				boolean b = a.isEmpty();
//				the output of the string is true since emptiness in string
		System.out.println(b);
		

		String c = "welcome";
		boolean d = c.isEmpty();
//		the output of the string is false since there is no emptiness in string
		System.out.println(d);
		
		String e = null;
				boolean f = e.isEmpty();
//				the output will be
//   (
				//					Exception in thread "main" java.lang.NullPointerException
//				at org.eighteenstringfunctions.FourthStringSyntaxFunctions.main(FourthStringSyntaxFunctions.java:18)
//        )
		System.out.println(f);
	}


}
