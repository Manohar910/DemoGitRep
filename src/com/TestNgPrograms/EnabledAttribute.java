package com.TestNgPrograms;

import org.testng.annotations.Test;

public class EnabledAttribute {
	// If any test method will failed ,then we can skip it with
	// enabled=false
	@Test(enabled = true)
	public void ApiTest() {
		System.out.println("Api testing...");
	}

// don't fail up to 4 seconds
	@Test(timeOut = 4000)
	public void LoadTest() {
		System.out.println("Load testing...");
	}

	@Test
	public void StressTest() {
		System.out.println("Stress testing...");
	}
}
