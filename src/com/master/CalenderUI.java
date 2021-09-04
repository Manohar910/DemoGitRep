package com.master;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();

		List<WebElement> dates = driver.findElements(By.className("day"));
	//	System.out.println(dates);
		int count = driver.findElements(By.className("day")).size();

		for (int i = 1; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();

			if (text.equalsIgnoreCase("25")) {
				System.out.println(driver.findElements(By.className("day")).get(i).getText());
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}

}
