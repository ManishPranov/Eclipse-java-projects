package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptAbsouteXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
//right click inspect
//click the arrow in the dom page and select the web element to be inspected
//now right click the selected code for the respective web element 
	// slect copy full xpath and paste here in the eclipse 
	WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
email.sendKeys("manishpranov7498@gmail.com");

}
}
