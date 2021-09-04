package com.master;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Url

		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		// Search
		// act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
		// .sendKeys("hello").build().perform();
		// Copy that hello
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(3000);
		// right click
		// act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();

		// Mouse hover
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
// click
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@id='nav-flyout-ya-signin']//a[@class='nav-action-button']//span[@class='nav-action-inner'][contains(text(),'Sign in')]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("9885353910");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_password")).sendKeys("Myamazon910");
		Thread.sleep(3000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);

		

		
	}

}
