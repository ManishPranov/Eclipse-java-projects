package com.javaclassone;

//(//)denotes command line
//letters after command line are not considered in program
//command lines are used only for reference
//similarly  coding between /* and */ will not run
//letters in purple are keywords

//click 'file-new-java project'
//type new project name in 'Pascal' select finish

//select new project created in the project explorer
//JRE and 'src' opens up
//right click 'src' then click 'new' and then 'class'
//click package and write package name in ' com /org.small letters'
//click name and write class name in pascal
//click finish
//this coding page opens up


public class ClassOneJava {

	// 'main' click 'ctrl+spacebar'

	public static void main(String[] args) {

		// type primitive data type variable and assign value
		// eg data type (integer),variable(a,b,c),value(50)

		int a = 50;
		int b = 50;
		int c = a + b;

		// to align program 'ctrl+shift+f'
		// click 'window' then 'show view' then 'console'
		// console gets displayed in the right side
		// similarly click 'window' then 'show view' then 'package explorer'
		// package explorer gets displayed on the left side

		// to get output type 'syso or sysout' click 'ctrl+spacebar'

		System.out.println(c);

		// type non primitive data type and assign multiple values
		// eg: data type (string),variable(d),value("welcome to java class one")

		String d = "WELCOME TO JAVA CLASS ONE";

		// to get output type 'syso or sysout' click 'ctrl+spacebar'
		System.out.println(d);

	}

}
