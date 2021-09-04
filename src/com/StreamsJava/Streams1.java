package com.StreamsJava;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Streams1 {

/*	@Test
	public void regularMethod() {

		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abhijith");
		names1.add("Aravindh");
		names1.add("Vimala");
		names1.add("Arjith");
		names1.add("Balu");
		int count = 0;
		for (int i = 0; i < names1.size(); i++) {
			String actval = names1.get(i);
			if (actval.startsWith("A")) {

				count++;
			}
			System.out.println(count);
		}

	}*/

	@Test
	public void StreamsMethod() {
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Abhijith");
		names2.add("Aravindh");
		names2.add("Vimala");
		names2.add("Arjith");
		names2.add("Balu");
		Long c = names2.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
	}
}
