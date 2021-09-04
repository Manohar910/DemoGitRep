package com.master;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceAddToCart1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 10);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j = 0;
		// For multliple items
		String[] listItems = { "Cucucmber", "Brocolli", "Beetroot" };

		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.product-name")));
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-");
			String formatedName = name[0].trim();
			// format it to get actual vegetable name
			Thread.sleep(2000);
			// Converting array into array list
			List ItemsNeeded = Arrays.asList(listItems);

			if (ItemsNeeded.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				if (j == 3) {
					break;
				}
				driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[class='promoBtn']")).click();
				Thread.sleep(2000);
				w.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Code applied ..!']")));
				System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());

			}
		}
	}
}
