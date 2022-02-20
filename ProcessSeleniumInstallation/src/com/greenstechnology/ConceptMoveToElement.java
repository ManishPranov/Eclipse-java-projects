package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConceptMoveToElement {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to get the url use method referencename.get("");
		// open chrome
//type dropdown menus ironspider in the tab and copy and paste them in get method using string
//i.e get("https://www.ironspider.ca/forms/dropdowns.htm#example2")
//go to multiple selections example
		driver.get("https://www.amazon.in/");
//since the front page changes daily in amazon when you run this program error occurs 
		Thread.sleep(3000);
		WebElement sc = driver.findElement(By.xpath("//img[@alt='Xiaomi 11 Lite NE 5G']"));
	 	Actions act = new Actions(driver);
		act.moveToElement(sc).build().perform();

	}
}
