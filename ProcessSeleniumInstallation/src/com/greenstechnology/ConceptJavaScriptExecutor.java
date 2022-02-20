package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptJavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.xpath("//a[text()='Mobiles']"));

//		java script executor is used at the place where selenium cant be used
//		the following is the syntax
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//		the following method helps to click the web element using java script
		js.executeScript("arguments[0].click()", findElement);
		
//		the following method helps to scrolldown in the webpage using java script
		js.executeScript("window.scrollBy(0,7000)");
		
//		the following method helps to scrollup in  the webpage using java script
		js.executeScript("window.scrollBy(0,-5000)");

//		the following method helps to scroll to  the top of webpage using java script

		js.executeScript("window.scroll(0,0)");

		
		WebElement phone = driver.findElement(By.xpath("//h2[contains(text(),'in')]"));
		
//		the following method helps to movedown to the web element using java script
		js.executeScript("arguments[0].scrollIntoView()", phone);

	}

}
