package com.TestNgPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllMethods {
	@Test
	public void f() {
		System.out.println("Test..");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("BeforeMethod..");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod...");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest...");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test...");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite..");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite...");
	}

}
