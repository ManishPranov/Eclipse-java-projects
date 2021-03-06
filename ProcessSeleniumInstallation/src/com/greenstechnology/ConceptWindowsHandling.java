package com.greenstechnology;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConceptWindowsHandling {
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

		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(mobile).build().perform();
		Robot r = new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronic = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(electronic).build().perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		act.contextClick(fashion).build().perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

//      String str = driver.getWindowHandle();
//	  System.out.println(str);

	
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		Thread.sleep(3000);
		String s = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		for (String stringone : windowHandles) {
			if (driver.switchTo().window(stringone).getTitle().equals(s)) {
				System.out.println("Task Completed");
				break;
			}
		}

	}
}
