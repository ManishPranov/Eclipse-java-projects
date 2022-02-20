package org.classscanner;

//create project package class main method
//provide syntax of scanner and import scanner class
import java.util.Scanner;

public class GettingArrayValuesUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		to get the index size(numbers) of array from user type syso+ctrl+space 
//		provide the following line
		System.out.println("ENTER THE INDEX SIZE");
		int z = sc.nextInt();
//		provide array syntax
//		data type variable []= new datatype[];
//		here [] means array
		int a[] = new int[z];
//to get the array values create for loop and type as follows
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the  " + i + " value");
			a[i] = sc.nextInt();
//			here the array values assigned by the users
		}
//		to print continuously the array values assigned by the users  
//		create other for loop as follows 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
