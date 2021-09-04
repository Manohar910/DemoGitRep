package com.StreamsJava;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Streams3 {

	@Test
	public void SortedStream() {
		// Converting array list to list
		List<String> names = Arrays.asList("Mahesh", "Sruthi", "Mallesh", "Mallika");

		// Print the names which have first letter as 'a' with upper case and sorted

		names.stream().filter(s -> s.startsWith("M")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}//MAHESH MALLESH MALLIKA
}
