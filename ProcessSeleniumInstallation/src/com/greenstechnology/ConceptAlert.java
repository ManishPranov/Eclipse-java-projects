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

public class ConceptAlert {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to get the url use method referencename.get("");
		// open chrome
//	type demoqa in the tab then select alerts and copy and paste the url opened in alert page in get method using string
//i.e get("https://demoqa.com/alerts")
		driver.get("https://demoqa.com/alerts");

		// concept alert
//		driver.switchTo().alert().methods()
//		method one
//		take xpath and using  find element  take returntype as follows
		WebElement ok = driver.findElement(By.xpath("//button[@id='alertButton']"));
		ok.click();
		Thread.sleep(3000);
//		using alert to click ok we use method .accept() as follows
		driver.switchTo().alert().accept();

		// method2
//		using alert to click cancel we use method .dismiss() as follows
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm.click();
		driver.switchTo().alert().dismiss();

		// method3
//		using alert for value passing we use method .sendkeys() as follows
		WebElement prompt = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		prompt.click();
		driver.switchTo().alert().sendKeys("manish");
		driver.switchTo().alert().accept();

	}
}
