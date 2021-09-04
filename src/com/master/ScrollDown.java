package com.master;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Url

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// we have to search in dom console page for page scrolling
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		// we have to search in dom console page for table scrolling
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText());
		@SuppressWarnings("unused")
		int total = Integer
				.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
	}
}
