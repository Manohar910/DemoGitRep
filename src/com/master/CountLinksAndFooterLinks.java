package com.master;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinksAndFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		// count all the links in web page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// count only footer section links
		WebElement footerDriver = driver.findElement(By.xpath("//div[@class='_2WErco row']"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// count only first column links
		WebElement columnDriver = driver.findElement(By.xpath("//div[@class='_2Brcj4']"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		// click on each element to know it is working or not
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {

			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);

		}
		// open all the tabs
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
