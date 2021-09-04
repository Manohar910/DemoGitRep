package com.TestNgPrograms;

import org.testng.annotations.Test;

public class SkippingMthdsExcludeInclude {
	@Test(groups = "Smoke")
	public void MobileLogin() {
		System.out.println("Mobile login...");
	}

	@Test(groups = "Smoke")
	public void MobileLogout() {
		System.out.println("Mobile logout...");
	}

	@Test
	public void WebLogin() {
		System.out.println("Web login...");
	}

	@Test
	public void WebLogout() {
		System.out.println("Web logout...");
	}

	@Test
	public void ApiLogin() {
		System.out.println("Api login...");
	}

	@Test
	public void ApiLogout() {
		System.out.println("Api logout...");
	}
}