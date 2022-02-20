package org.exceptionhandlingconcept;
//create project package class and main method 
import java.util.Scanner;

public class InputMismatchTryCatchHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//But integer cant accept the string values  so it  throws input mismatch exception error
		try {
			int b = sc.nextInt();
			System.out.println(b);
		} catch (Exception e) {
			System.err.println("Input Mismatch exception");
//			e.printStackTrace();
	
		}

	}

}
