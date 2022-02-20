package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

//	single frame-one frame one inputbox
	driver.get("http://demo.automationtesting.in/Frames.html");
	WebElement singleframe = driver.findElement(By.id("singleframe"));
driver.switchTo().frame(singleframe);
WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
text.sendKeys("mainsh");

//defaultframe-to exit from the page
driver.switchTo().defaultContent();

//multiframe-contains multiple frame
WebElement multi = driver.findElement(By.xpath("//a[@href='#Multiple']"));
multi.click();
WebElement thirdframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
driver.switchTo().frame(thirdframe);
WebElement secondframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
driver.switchTo().frame(secondframe);
WebElement sendtext = driver.findElement(By.xpath("//input[@type='text']"));
sendtext.sendKeys("fuck");




}
}
