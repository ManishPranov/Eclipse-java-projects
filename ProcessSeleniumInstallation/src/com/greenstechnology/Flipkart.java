package com.greenstechnology;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();

		a.get("https://www.google.com/");
		a.manage().window().maximize();
		String b = a.getCurrentUrl();
		System.out.println(b);
		a.navigate().to("https://www.flipkart.com/");
		String c = a.getTitle();
		System.out.println(c);
		a.navigate().back();
		a.navigate().forward();
		a.navigate().refresh();
		a.close();
		

	}
}
