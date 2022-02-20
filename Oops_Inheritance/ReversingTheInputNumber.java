package org.classscanner;

//create project package class main method
//provide syntax of scanner and import scanner class
import java.util.Scanner;

public class ReversingTheInputNumber {
	public static void main(String[] args) {
//		initial values are asssigned to i & j
		int i = 0;
		int j = 0;

		Scanner sc = new Scanner(System.in);
//		get the number to be reversed from the user as follows
		System.out.println("type the number to be reversed");
		int n = sc.nextInt();
//    the number recieved from the user are assigned to new datatype variable as follows
		int a = n;
//provide while condition to reverse the number
//		in conditions provide a>0

		while (a > 0) {
			// here a%10 the remainder value is taken
//		initially for a = 531 
//	therefore after	first run i =1
//		in the second run a=53
//		therefore after	first run i =3
//		in the third run a=5
//		but after	third run i =5 because when division goes by decimal (point values eg 0.1)
//		i takes the value of a

			i = a % 10;
//		inial value of j is given in syntax  is considered in the first run of j syntax
//    first run i value is considered in the first run of j syntax
//	therefore after first run j=1 is 
//		in the second run i=3
//		therefore after	second run j =13
//		in the third run i=5
//		therefore after	third run j =135
			j = (j * 10) + i;
//here a/10 the quotient value is taken	
//		initially for a = 531 
//		therefore after first run a=53 
//		therefore second first run a=5
// but after third run a=0 when division goes by decimal (point values eg 0.1)
//		a takes the value of 0
			a = a / 10;
		}

		System.out.println(j);

	}

}
