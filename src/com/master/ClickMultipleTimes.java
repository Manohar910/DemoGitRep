package com.master;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickMultipleTimes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(2000);
		// From
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		// To
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//tbody//tr//td[@class='mapbg']//div[@class='search_options_menucontent']//div[@id='dropdownGroup1']//div[@class='dropdownDiv']//ul//li//a[@href='#'][contains(text(),'Tirupati (TIR)')]"))
				.click();
//calander     something went wrong with this
		driver.findElement(
				By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[4]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		// check box
		driver.findElement(By.cssSelector("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		// Adult passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println("Before selecting:" + driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();// 5 adults
		}
		driver.findElement(By.id("btnclosepaxoption")).click();// done
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println("After selecting:" + driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		// Currency static drop down
		WebElement inr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(2000);
		Select s = new Select(inr);
		s.selectByVisibleText("AED");
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(3000);
//search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
