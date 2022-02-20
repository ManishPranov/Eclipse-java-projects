package org.runtimeoruncheckedexception;
//create project package class and main method
//since we are going to see String Index Out Of Bound exception 
//from the name itself it is String that input means String programms 
//so give the String syntax

public class StringIndexOutOfBoundIndexExceptionConcept {
public static void main(String[] args) {
	String a = "WelCome";
//	Giving out of string index valuyes throws String Index Out Of Bound Index Exception
char b = a.charAt(9);
System.out.println(b);
}
}
