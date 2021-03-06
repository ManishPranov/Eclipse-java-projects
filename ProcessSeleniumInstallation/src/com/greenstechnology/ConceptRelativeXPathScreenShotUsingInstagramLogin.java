package com.greenstechnology;
//create project package class main method 
//create property setup
//i.e 	System.setProperty("drivename","filename")
//click the error and import the following two lines
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//then provide the following syntax
//	WebDriver driver = new ChromeDriver();

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptRelativeXPathScreenShotUsingInstagramLogin {
private static final File SrcFile = null;

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	//to get the url use method referencename.get("");
	// open chrome
//	type instagram.com in the tab and copy and paste them in get method using string
//i.e get("https://www.instagram.com/")
	driver.get("https://www.instagram.com/");

//	if id and name is not available use method xpath
//	type referencename.findelement
	//inside () type by ctrl+space introduce xpath
//	to get xpath go to chrome -instagram
//	right click inspect
//	click the webelement username then right click inspect
//	click ctrl+f to open xpath tab in dom
//	xpath syntax : //tagName[@attributeName = 'attribute value']
//tagName-pink color
//	attributeName-orange color 
//	attribute value-blue color
//	provide the required tagName,attributeName, attribute value in dom in chrome page
//	copy them and paste them in this method within strings
//then pass the required 	send keys
	
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
user.sendKeys("manishpranov");
//here after passing send keys in user while running it shows no such element exception
//to over come that we use thread.sleep above the line as like here
//in () milliseconds here 3000 means 3 seconds
// click the error in the line and select declaration throws
//select throwable in the main method


WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("manish143");

//after passing username and password then only login is enabled 
WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
login.click();

//concept screenshot to send errors to the higher officials

//step1
//type takes ctrl+space and complete the following syntax
//TakesScreenshot scr = driver; 
//click the error in this line and import casting(type casting)
Thread.sleep(5000);
TakesScreenshot scr= (TakesScreenshot) driver;

//step 2
//Type scr.getscreen ctrl+space selectscr.getScreenshotAs(arg0)
//inside bracket type output ctrl+space select OutputType
//type .fi ctrl+space select file
//take the return type using ctrl+2 as follows
//File srcFile = scr.getScreenshotAs(OutputType.FILE);
File srcFile = scr.getScreenshotAs(OutputType.FILE);

//step 3
//Type fil ctrl+space reference name equal to Type fil ctrl+space 
//File dest = new File("location/path.format");
//to get location or path rightclick this project in the package explorer
//create a new folder here screenshot
//right click the new folder created select the properties
//copy the location and paste them in program
//to get the format type \\snap.png
File dest = new File("C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Screenshot\\snap.png");

//step 4
//type fileu ctrl+space select FileUtils 
//type .copyfil ctrl+space
//select copyFile(srcFile, destFile)
//FileUtils.copyFile(srcFile, destFile);
FileUtils.copyFile(srcFile, dest);

//step 5
//run the program
//right click the screenshot folder created inside this project in the package explorer
//select the refresh 
//now check the screenshot folder created now you can find the image 
//since the snap is incomplete type thread ctrl+space type .sleep ctrl+space
//i.e Thread.sleep(5000);
//here 5000 milliseconds means 5 seconds


}
}

