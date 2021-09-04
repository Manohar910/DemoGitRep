package com.StreamsSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class WebTable2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Getting the veggie's prices(Page nation)

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		Thread.sleep(2000);
		// Capture all web elements into list
		List<WebElement> eleList = driver.findElements(By.xpath("//tr/td[1]"));
		// Capture text of all web elements into new list
		List<String> originalList = eleList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// Sort in the original list step of list 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// Compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		// Scan the name column and get text ->Print the price of beans
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVeggiePrice(s))
					.collect(Collectors.toList());

			price.forEach(s -> System.out.println(s));
			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
