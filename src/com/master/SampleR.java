package com.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleR {
	static WebDriver driver;
	static String Expval, Actval;

	@BeforeSuite
	public static void Launch_Url() throws Exception {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(2000);

		String baseURL = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(baseURL);
		System.out.println("driver" + driver);

		System.out.println("Title is:" + driver.getTitle());
	}

	@Test(enabled = true, priority = 1)
	public static void PracticePage() throws Exception {
		// practice page confirmation 1
		boolean isd = driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]")).isDisplayed();
		System.out.println("page:" + isd);
		// practice page confirmation 2
		Expval = "Practice Page";
		Actval = driver.findElement(By.xpath("//h1[contains(text(),'Practice Page')]")).getText();
		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Launched to successfully");
		} else {
			System.out.println("Failed");
		}
		// Radio Button Example
		driver.findElement(By.name("radioButton")).click();

		// Suggession Class Example
		driver.findElement(By.id("autocomplete")).sendKeys("india");

		// Dropdown Example
		new Select(driver.findElement(By.id("dropdown-class-example"))).selectByVisibleText("Option3");

		// Checkbox Example
		driver.findElement(By.id("checkBoxOption2")).click();

		// Switch To Alert Example
		driver.findElement(By.id("name")).sendKeys("Manohar910");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 2)
	public static void homePage() {
		Expval = "contact@rahulshettyacademy.com";
		driver.findElement(By.xpath("//button[contains(text(),'Home')]")).click();
		Actval = driver.findElement(By.xpath("//li[contains(text(),'contact@rahulshettyacademy.com')]")).getText();
		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Navigated to suucessfully...");
		} else {
			System.out.println("failed to navigate...");
		}
	}

	@Test(enabled = true, priority = 3)
	public static void coursesPage() throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div[@class='navbar-collapse collapse clearfix']//ul[@class='navigation clearfix']//li//a[contains(text(),'Courses')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//body/div[@class='view-school']/div[contains(@class,'view-directory course-directory')]/div[@class='container']/div[@class='row search']/div[2]/div[2]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/courses/author/562540']")).click();
		boolean rhl = driver.findElement(By.xpath("//h2[contains(text(),'Rahul Shetty')]")).isDisplayed();
		System.out.println("Author is rahul shetty:" + rhl);

		Thread.sleep(3000);
		Expval = "All-Access Membership";
		driver.findElement(By.xpath("//div[contains(text(),'All-Access Membership')]")).click();
		Thread.sleep(3000);
		Actval = driver.findElement(By.xpath("//h1[@class='course-title']")).getText();

		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Exact course page-Enroll in course");
		} else {
			System.out.println("Its not a exact course page");
		}
	}

	@Test(enabled = false, priority = 4)
	public static void learningPathPage() throws Exception {
		Thread.sleep(3000);
		Expval = "Learning Path";
		driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[4]/a"))
				.click();
		Thread.sleep(3000);
		Actval = driver.findElement(By.xpath("//h1[contains(text(),'Learning Paths')]")).getText();
		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Learning path page");
		} else {
			System.out.println("Its not a learning path page");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[@ng-version='9.1.9']/div[@class='page-wrapper']/app-learning-path/div[@class='container']/div[@class='row clearfix']/div[@class='content-side col-xs-12']/div[@class='row align-items-center justify-content-center']/div[@class='col-md-12 text-center filterButtons']/a[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'SDET Automation Engineer – JAVA')]")).click();

		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 5)
	public static void mentarShipPage() throws Exception {
		Expval = "Mentorship";
		driver.findElement(By.xpath("//a[contains(text(),'Mentorship')]")).click();
		Thread.sleep(3000);
		Actval = driver.findElement(By.xpath("//h1[contains(text(),'Mentorship')]")).getText();
		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Mentorship page");
		} else {
			System.out.println("Its not a mentorship page");
		}
	}

	@Test(enabled = true, priority = 6)
	public static void blogPage() throws Exception {
		// blog
		Expval = "Welcome to the Rahul Shetty Academy Blog";
		driver.findElement(By.xpath(
				"//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div[@class='navbar-collapse collapse clearfix']//ul[@class='navigation clearfix']//li//a[contains(text(),'Blog')]"))
				.click();
		Thread.sleep(3000);
		Actval = driver.findElement(By.xpath("//h1[@data-css='tve-u-16f189c8a2a']")).getText();
		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Blog page");
		} else {
			System.out.println("Its not a blog page");
		}
		// search
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='thrv-sf-submit']//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//article[@id='post-527']//div[@class='thrv_wrapper thrv-columns']//div[@class='tcb-flex-row v-2 tcb-resized tcb--cols--2']//div[@class='tcb-flex-col']//div[@class='tcb-col']//div[@class='thrv_wrapper thrv_contentbox_shortcode thrv-content-box tve-elem-default-pad tcb-local-vars-root']//div[@class='tve-cb']"))
				.click();

	}

	@Test(enabled = true, priority = 7)
	public static void joincourse() throws Exception {
		// home
		Thread.sleep(3000);
		driver.findElement(By.className("tcb-button-link")).click();
	}

}
