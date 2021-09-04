package com.master;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://altoconvertpdftoword.com/");
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\jc\\Documents\\AutoItScriptM\\FileAutoIt1.exe");
	}
}
