package com.StreamsJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams4 {
	@Test
	public void uniqNumber() {
		// Print unique number and sort it
		List<Integer> values = Arrays.asList(4,2,2,4,1,1,3,3);
		values.stream().distinct().forEach(s -> System.out.println(s));

	}

	@Test
	public void sortedStream() {
		// Sorted integer and print 3rd index number
		List<Integer> values = Arrays.asList( 1, 1, 2, 2, 5, 5, 3, 3, 4, 4);
		//values.stream().distinct().forEach(s -> System.out.println(s));
		List<Integer> ls = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("3rd index values:"+ls.get(2));
	}
}
