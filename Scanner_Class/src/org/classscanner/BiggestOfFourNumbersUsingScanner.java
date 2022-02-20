package org.classscanner;
//create project package class main method
//provide syntax of scanner and import scanner class
import java.util.Scanner;

public class BiggestOfFourNumbersUsingScanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	//	to get the first number type syso+ctrl+space as follows
//	using scanner get input from users
	
	System.out.println("enter the first  number");
    int a = sc.nextInt();

	System.out.println("enter the second  number");
	int b = sc.nextInt();
	
	System.out.println("enter the third  number");
	int c = sc.nextInt();
	
	System.out.println("enter the fourth  number");
	int d = sc.nextInt();
//	provide if,else if,else statement & provde the conditions 
//	and get output by providing syso+ctrl+space
//	&& is used inside condition 
//i.e take the condition a>b && a>c
//	if the condition a>b only then condition a>c is checked using && 
if (a>b && a>c && a>d ) {
	System.out.println("a is the biggest number");
}
else if (b>a && b>c && b>d) {
	System.out.println("b is the biggest number");
}
else if (c>a && c>b && c>d) {
	System.out.println("c is the biggest number");
}	
else {
	System.out.println("d is the biggest number");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
