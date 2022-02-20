package com.greenstechnology;
//create project package class main method

//create property setup
//i.e 	System.setProperty("drivename","filename")
//then provide the following syntax
//WebDriver driver = new ChromeDriver();
//click the error and import the following two lines
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to get the url use method referencename.get("");
		// open chrome
//	type dropdown menus ironspider in the tab and copy and paste them in get method using string
//i.e get("https://www.ironspider.ca/forms/dropdowns.htm#example2")
//go to multiple selections example
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm#example2");
//		since we are going to use select method tagname select is copied with xpath syntax as follows 

		WebElement a = driver.findElement(By.xpath("//select[@name='coffee2']"));
//syntax for select class is given and import the following line by clicking error in the line
		Select s = new Select(a);
// to check ehether the multiple options is selected method ismultiple is used 
//		i.e s.isMultiple() is given with returntype ctrl+2
		boolean multiple = s.isMultiple();
		System.out.println("to check whether the selected options are multiple  " + multiple);

		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// then select the options by selectByValue method as follows
		s.selectByValue("milk2");
		s.selectByValue("whipped");
//		s.getAllSelectedOptions() method prints the values from milk2 to whipped 
//		i.e after taking return type syntax and using foreach loop as follows
		List<WebElement> s1 = s.getAllSelectedOptions();

//using foreach loop to iterate the values and print them in lines
//		get text is used to print the string oiptions
		for (WebElement web : s1) {

			System.out.println("to get all selected options " + web.getText());
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// similarly s.getOptions()is given whole the options present in webelement is
		// printed
		List<WebElement> s2 = s.getOptions();
		for (WebElement Element : s2) {
			System.out.println("to get options " + Element.getText());
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------");

//similarly s.getFirstSelectedOption()is given the first select by value is printed i.e milk2
		WebElement s3 = s.getFirstSelectedOption();
		System.out.println(s3.getText());

		System.out.println(
				"----------------------------------------------------------------------------------------------");

	}
}
