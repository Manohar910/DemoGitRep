package com.StreamsJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Dummy {
	@Test
	public void dummyList() {

		List<String> names = Arrays.asList("Manohar", "Mallika", "Mahesh", "Srikanth");
		System.out.println(names);

	}

	@Test
	public void dummyStream() {
		Stream.of("Mahesh", "Vihari", "Rahane", "Chakri").filter(s -> s.startsWith("M")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}
}
