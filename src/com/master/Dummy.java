package com.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class Dummy {
	@Test(dataProvider = "MantisData")
	public void DataMethod(String un, String pwd) {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/bugtracker/login_page.php");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("[class='button']")).click();
		// assert.assertEquals(driver.getTitle(),"MantisBT");
	}

	@DataProvider
	public Object[][] MantisData() {
		Object[][] obj = new Object[1][2];

		obj[0][0] = "edward";
		obj[0][1] = "qwerty123";
		return obj;

	}

}
