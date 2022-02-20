package com.greenstechnology;

//create project package class main method
//create property setup
//i.e 	System.setProperty("drivename","filename")
//then provide the following syntax
//WebDriver driver = new ChromeDriver();
//click the error and import the following two lines
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConceptUsingFacebookLogIn {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//to get the url use method referencename.get("");
		// open chrome
//		type facebook.com in the tab and copy and paste them in get method using string
	//i.e get("https://www.facebook.com/")

	driver.get("https://www.facebook.com/");
	
//	type referencename.findelement
	//inside () type By ctrl+space THEN .id ctrl+space select id if id is available facebook dom after inpecting in chrome page
//	i.e id = email (available in facebook dom after inpecting in chrome page)
//	then provide re1turn type using ctrl+2 
//	reference name of new return type .sendkeys ctrl+space select sendkeys

	WebElement mail = driver.findElement(By.id("email"));
	mail.sendKeys("manishpranov7498@gmail.com");

	//is enabled- to check whether the element is editable or clickable
	boolean enabled = mail.isEnabled();
	System.out.println(enabled);

	//	is displayed-to check whether the element is  visible or available in page
	boolean displayed = mail.isDisplayed();
	System.out.println(displayed);

//	is selected- it will clear the passed data
	boolean selected = mail.isSelected();
	System.out.println(selected);

//	type referencename.findelement
	//inside () type By ctrl+space THEN .name ctrl+space select name if name is available facebook dom after inpecting in chrome page
//	i.e name = pass (available in facebook dom after inpecting in chrome page)
//	then provide return type using ctrl+2 
//	reference name of new return type .sendkeys ctrl+space select sendkeys

	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("manishpranov7498");
	
	//	type referencename.findelement
	//inside () type By ctrl+space THEN .name ctrl+space select name if name is available facebook dom after inpecting in chrome page
//i.e name = login (available in facebook dom after inpecting in chrome page)
//	then provide return type using ctrl+2
//	since there no values to be passed in login and it has to be clicked
//	method .click() is used
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
//	Thread.sleep(3000);
//	 WebElement text = driver.findElement(By.xpath("//div[contains(text(),'quick ')]"));
//		String text2 = text.getText();
//		System.out.println(text2);

		
		
	}

}
