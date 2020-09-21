package com.cision.accion.sample;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciSeries {

	public List<Integer> fibonacciSeries(int limit) {
		return Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] }).limit(limit).map(n -> n[0])
				.collect(toList());
	}
}
