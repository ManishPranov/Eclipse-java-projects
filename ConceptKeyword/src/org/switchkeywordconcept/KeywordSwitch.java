package org.switchkeywordconcept;
//create project package class main method
public class KeywordSwitch {
public static void main(String[] args) {
//	keyword switch is used to print the sequence datas or default value
//	like week days or month
//	for month we use string datatype
//	for week days we use integer datatype as follows
	int day = 7 ;
//	type switch ctrl+space the following line will be displayed
//	switch (key) {
//	case value:
//			break;
//	default:
//		break;
//	}
//if we are going to give different keys  
//	copy and paste switch ,case value, break line,between default line
//	switch (key) {
//	case value:
//			break;
	switch (day) {
	case 1:
System.out.println("Monday");		
		break;
case 2:
	System.out.println("Tuesday");		
		break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;

	default:
		System.out.println("Invalid day");
		break;
	}
}
}
