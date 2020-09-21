package com.cision.accion.sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloAccion {

	public static void main(String[] args) {

		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
		final LocalDateTime now = LocalDateTime.now();
		System.out.println("Hello, Accion! Lets meet at " + dtf.format(now));

		// Check Fibonacci Numbers with java stream
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		System.out.println(fibonacciSeries.fibonacciSeries(5));
	}

}
