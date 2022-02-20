package org.classscanner;

//create project package class main method
//type syntax scanner
//Scanner reference name = new Scanner(System.in);
//S letter of Scanner and System should be in capital
//click error in the line and select ("import java.util.Scanner;")
//it will be inserted between package and class

import java.util.Scanner;

public class ScannerConcept {
	public static void main(String[] args) {

//after creating main method provide scanner syntax and import scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("more than one word");
//		for more than one word in input type (reference name.nextline )then type ctrl+2+l 
//		the following syntax line will automatically come 
		String b = sc.nextLine();
		System.out.println(b);

		System.out.println("type oneword");
//	for one word in input type (reference name.next )then type ctrl+2+l	
//		the following syntax line will automatically come	
		String a = sc.next();
		System.out.println(a);

		System.out.println("enter one number");
//	for one value in input type (reference name.nextint )then type ctrl+2+l		
		int c = sc.nextInt();
		System.out.println(c);

		System.out.println("enter the decimal value");
//	for one decimal value in input type (reference name.nextFloat )then type ctrl+2+l		
		float d = sc.nextFloat();
		System.out.println(d);
		
}

}

