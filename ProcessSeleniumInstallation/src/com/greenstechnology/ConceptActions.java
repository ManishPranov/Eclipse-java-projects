package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConceptActions {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to get the url use method referencename.get("");
		// open chrome
	//type dropdown menus ironspider in the tab and copy and paste them in get method using string
	//i.e get("https://www.ironspider.ca/forms/dropdowns.htm#example2")
	//go to multiple selections example
		driver.get("https://demoqa.com/buttons");

	
		WebElement sc = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions act = new Actions(driver);
        act.click(sc).build().perform();
        
 WebElement rc = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	act.contextClick(rc).build().perform();
	
	Thread.sleep(3000);
	WebElement dc = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	act.doubleClick(dc).build().perform();
	
	}

}
