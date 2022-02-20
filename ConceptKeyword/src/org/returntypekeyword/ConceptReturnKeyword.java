package org.returntypekeyword;
//create project package class
public class ConceptReturnKeyword {
//create method one 
//	change public to private
//	to do return rype keyword type datatype front of methodname as follows
	public String employeeName(String a, String b) {
		// click the error and import return keywprd
//		inside return give the functions of variable as follows(here a+b)
	return a+b;
	}
public int employeeId(int a,int b) {
	return a+b;
}
public static void main(String[] args) {
//	oops syntax 
	ConceptReturnKeyword c = new ConceptReturnKeyword();
 // since the values arent given
//	with reference name  and method name type ctrl+2+l 
	String d = c.employeeName("MANISH", "PRANOV");
System.out.println(d);
int e = c.employeeId(101,99);
System.out.println(e);



}
}
