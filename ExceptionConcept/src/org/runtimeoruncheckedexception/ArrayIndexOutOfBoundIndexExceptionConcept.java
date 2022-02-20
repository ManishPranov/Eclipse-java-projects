package org.runtimeoruncheckedexception;
//create project package class and main method
//since we are going to see Array Index Out Of Bound exception 
//from the name itself it is array that input means array programms 
//so give the array syntax 
public class ArrayIndexOutOfBoundIndexExceptionConcept {
public static void main(String[] args) {
	int a [] = new int [2];
	a[0]=999;
	a[1]=77;
//	if the array index number is given out of given array 
//	it shows Array Index Out Of Bound exception
	System.out.println(a[2]);
	
//	similarily 
//	String a [] = new String [2];
//	a[0]="Java";
//	a[1]="SElenium";
//	if the array index number is given out of given array 
//	it shows Array Index Out Of Bound exception
//	System.out.println(a[2]);
}
}
