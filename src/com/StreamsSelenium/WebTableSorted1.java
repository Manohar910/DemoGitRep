package com.StreamsSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class WebTableSorted1 {
	@SuppressWarnings("deprecation")
	@Test
	public void sortedTable() {
// Sorting the table and asserting original vs sorted list
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();//column name
		// Capture all web elements into list
		List<WebElement> eleList = driver.findElements(By.xpath("//tr/td[1]"));
		// Capture text of all web elements into new list
		List<String> originalList = eleList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// Sort in the original list step of list 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// Compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
	}
}
