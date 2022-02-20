package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConceptDragAndDropInAction {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/pages/drop.html");

	Thread.sleep(3000);

	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));


	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();

}
}
