package com.greenstechnology;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountInFacebookUsingSingleDropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();

		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstname.sendKeys("manish");

		WebElement secondname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		secondname.sendKeys("pranov");

		WebElement proof = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		proof.sendKeys("987654321");

		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		pass.sendKeys("manish12345678");
//single drop down is used when we select single option from multiple options
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s = new Select(day);
//select by value  method is based on attribute value text in dom page
		s.selectByValue("7");

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select ss = new Select(month);
		
		//select by index  method is based on index number in dom page
        ss.selectByIndex(3);

		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select sss = new Select(year);

		//select by visible text  method is based on attribute value in dom page
		sss.selectByVisibleText("1998");

		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		gender.click();

		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();

		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sf = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Screenshot\\snap2.png");
		FileUtils.copyFile(sf, dest);

	}

}
