package com.greenstechnology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptDynamicXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THIRU\\eclipse-workspace\\ProcessSeleniumInstallation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.myntra.com/men-kurtas?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIurqryozh9AIVtMBMAh0WlwJgEAAYASACEgKQ2PD_BwE");

		List<WebElement> shirts = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));

		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < shirts.size(); i++) {
			String replaceAll = shirts.get(i).getText().replaceAll("Rs. ", "");

			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);
		}
		int size = a.size();
		System.out.println("the total number of product is : " + size);
		System.out.println("the maximum price is : " + Collections.max(a));
	
	}
}