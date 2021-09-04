package com.StreamsJava;

import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams2 {

	@Test
	public void StreamMapUpperCase() {
		Stream.of("Mahesh", "Vikash", "Maliika").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
	}
	@Test
	public void StreamMapLowerCase() {
		Stream.of("NITHISH","MEHAR","LALLIKA","KAMALA").filter(s->s.endsWith("A")).map(s->s.toLowerCase())
		.forEach(s->System.out.println(s));
	}
}
