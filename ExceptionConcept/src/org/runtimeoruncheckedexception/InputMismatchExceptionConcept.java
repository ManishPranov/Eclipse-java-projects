package org.runtimeoruncheckedexception;

//create project package class and main method 
//since we are going to see input mismatch exception
//from the name itself it is clear that input means scanner programms 
// so give the sacanner syntax and import the following line
import java.util.Scanner;

public class InputMismatchExceptionConcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	string can accept the integer values  so it doesnt throw any error
		String a = sc.next();
		System.out.println(a);

//But integer cant accept the string values  so it  throws input mismatch exception error
		int b = sc.nextInt();
		System.out.println(b);
//also check Integer parse int progrm in this package for better understanding
	}
}
