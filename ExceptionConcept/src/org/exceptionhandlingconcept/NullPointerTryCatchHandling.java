package org.exceptionhandlingconcept;
//create project package class and main method
public class NullPointerTryCatchHandling {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.isEmpty());
		} catch (Exception e) {
			System.err.println("Null Pointer Exception");
//			e.printStackTrace();
		}
	}

}
