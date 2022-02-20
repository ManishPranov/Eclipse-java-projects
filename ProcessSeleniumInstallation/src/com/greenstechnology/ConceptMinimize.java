package com.greenstechnology;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptMinimize {
	public static void main(String[] args) {
		// type sys ctrl+space Select
		// type setProperty ctrl+space
		// inside key type driver name as string
		// inside value type location name
		// or right click driver inside selenium project
		// select properties
		// copy location name and paste in the value name as string

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

//			Upcasting syntax is used
//			i.e getting the parent class property in the child class
//			the following is the syntax
		// then click the error in the program line
//				and import the following two lines between package AND class
//				import org.openqa.selenium.WebDriver;
//				import org.openqa.selenium.chrome.ChromeDriver;

		WebDriver a = new ChromeDriver();

		// refname.get();
//			go to chrome type www.google.com in search bar and copy that www.google.com
//			and paste inside the barcket
//			after pasting it will be like https://www.google.com/
//			give them inside the strings
		a.get("https://www.google.com/");

		// to maximize web(chrome)page we use
//			referencename.manage().window().maximize();
		a.manage().window().maximize();

		// to get the current url page name in console we use
//						String b = a.getCurrentUrl();
		// type ctrl+2 and import syntax and print them using syso
		String b = a.getCurrentUrl();
		System.out.println(b);

//				open google type www.amazon.in copy them and paste them in following method
//				to move to next search options we use the following method
//				a.navigate().to();	
		a.navigate().to("https://www.amazon.in/");
//to minimize by position method following 2 lines are used 
//			Point p = new Point(500,500);
//a.manage().window().setPosition(p);

//to minimize by position method following 2 lines are used 
		Dimension d = new Dimension(500, 500);
		a.manage().window().setSize(d);

	}

}
