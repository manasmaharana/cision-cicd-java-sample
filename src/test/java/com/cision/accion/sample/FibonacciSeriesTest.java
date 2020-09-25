package com.cision.accion.sample;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciSeriesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void fibonacci_series_not_null() {
		FibonacciSeries FibonacciSeries = new FibonacciSeries();
		List<Integer> series = FibonacciSeries.fibonacciSeries(5);
		Assert.assertNotNull(series);
	}

	@Test
	public void fibonacci_series_not_empty() {
		FibonacciSeries FibonacciSeries = new FibonacciSeries();
		List<Integer> series = FibonacciSeries.fibonacciSeries(5);
		Assert.assertEquals(5, series.size());
	}

	@After
	public void tearDown() throws Exception {
	}
}
