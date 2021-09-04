package com.TestNgPrograms;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void MobileTest() {
		System.out.println("Mobile test...");
	}

	@Test
	public void LapTest() {
		System.out.println("Lap test...");
	}

	@Test()
	public void VehicleTest() {
		System.out.println("Vehicle test...");
	}

	@Test(dependsOnMethods = { "MobileTest", "LapTest" })
	public void ManualTest() {
		System.out.println("Manual test...");
	}
}
