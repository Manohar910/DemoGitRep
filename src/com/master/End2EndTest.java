package com.master;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class End2EndTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
		// one way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		// from
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Hyderabad (HYD)')]")).click();
		Thread.sleep(3000);
		// to
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//tbody//tr//td[@class='mapbg']//div[@class='search_options_menucontent']//div[@id='dropdownGroup1']//div[@class='dropdownDiv']//ul//li//a[@href='#'][contains(text(),'Tirupati (TIR)')]"))
				.click();
		// from date
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']//tbody//tr//td[contains(@class,'')]//a[@class='ui-state-default'][contains(text(),'20')]"))
				.click();

		// click on multiple passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println("Before selecting:" + driver.findElement(By.id("divpaxinfo")).getText());

		// loop for multiple selection
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		// done
		driver.findElement(By.id("btnclosepaxoption")).click();
		// Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5
		// Adult");
		System.out.println("After selectiong:" + driver.findElement(By.id("divpaxinfo")).getText());

		// currency drop down
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select usd = new Select(ele);
		usd.selectByVisibleText("USD");
		System.out.println(usd.getFirstSelectedOption().getText());

		// click on check box
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
	}

}
