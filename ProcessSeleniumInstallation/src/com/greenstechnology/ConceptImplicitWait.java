package com.greenstechnology;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
//	for no such element exception instead of thread.sleep we use implicit wait with following syntax
//like thread.sleep we give implicit syntax above the line where it throws no such element exception
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstname.sendKeys("manish");


	}

}
