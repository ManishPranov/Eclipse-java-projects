 package com.greenstechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptCssSelector {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	WebElement email = driver.findElement(By.cssSelector("input#email"));
email.sendKeys("manishpranov7498@gmail.com");

WebElement pass = driver.findElement(By.cssSelector("#pass"));
pass.sendKeys("fuck");

WebElement create = driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
create.click();
Thread.sleep(3000);

WebElement fname = driver.findElement(By.cssSelector("input[name='firstname']"));
fname.sendKeys("manish");

WebElement sname = driver.findElement(By.cssSelector("[name='lastname']"));
sname.sendKeys("pranov");

WebElement mobile = driver.findElement(By.cssSelector("[aria-label^='Mobile']"));
mobile.sendKeys("9876672783");

WebElement newpass = driver.findElement(By.cssSelector("[type$='word']"));
newpass.sendKeys("done");


}
}
