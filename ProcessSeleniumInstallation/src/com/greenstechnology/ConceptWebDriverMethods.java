package com.greenstechnology;
//Create project,package,class,main method

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptWebDriverMethods{
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

//	Upcasting syntax is used
//	i.e getting the parent class property in the child class
//	the following is the syntax
	//then click the error in the program line 
//		and import the following two lines between package AND class
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.chrome.ChromeDriver;

		WebDriver a = new ChromeDriver();

//refname.get();
//	go to chrome type www.google.com in search bar and copy that www.google.com
//	and paste inside the barcket
//	after pasting it will be like https://www.google.com/
//	give them inside the strings
		a.get("https://www.google.com/");

		// to maximize web(chrome)page we use
//	referencename.manage().window().maximize();
		a.manage().window().maximize();
		
//to get the current url page name in console we use
//				String b = a.getCurrentUrl();
//type ctrl+2 and import syntax and print them using syso
		String b = a.getCurrentUrl();
		System.out.println(b);
		
//		open google type www.amazon.in copy them and paste them in following method
//		to move to next search options we use the following method
//		a.navigate().to();	
		a.navigate().to("https://www.amazon.in/");
		
//to get the title of the searched page we use following method 
//		referencename.getTitle() then ctrl+2 import the following syntax 
//		and to print them type syso
		String c = a.getTitle();
		System.out.println(c);
		
//		to go back to previous page we use the following method
//		i.e google to amazon back to google
		a.navigate().back();
		
//		to go back again to forward page we use the following method
//		i.e google to amazon back to google again forward to amazon	
		a.navigate().forward();

		//	to get the pagesource i.e dom page is opened in console	
//		String pageSource = a.getPageSource();
//		System.out.println(pageSource);
		
		//to refresh the opened page following method used
		a.navigate().refresh();
		
		//to close the opened page
	a.close();

		//to quit the browser
//	a.quit();

	
	
	
	
	}
}
