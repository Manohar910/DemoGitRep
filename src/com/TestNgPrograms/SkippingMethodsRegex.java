package com.TestNgPrograms;

import org.testng.annotations.Test;

public class SkippingMethodsRegex {
	// we r using exclude and include in this xml for skipping or including when
	// execution
	@Test
	public void WebLogin() {
		System.out.println("WebLogin...");
	}

	@Test(groups= {"Smoke"})
	public void MobileLogin() {
		System.out.println("Mobile login....");
	}

	@Test
	public void MobileLogOut() {
		System.out.println("Mobile logout...");
	}

	@Test(groups= {"Smoke"})
	public void MobileDesign() {
		System.out.println("Mobile design...");
	}

	@Test
	public void ApiLogin() {
		System.out.println("Api login...");
	}

	@Test
	public void ApiLogOut() {
		System.out.println("Api logOut...");
	}
}
