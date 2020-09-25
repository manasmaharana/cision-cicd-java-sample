package com.cision.accion.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunFacebookSelenium {

	public static void main(String[] args) {

		// declaration and instantiation of web browser
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/windows/chromedriver.exe");

		String baseUrl = "https://www.google.com";
		String expctedTitle = "Google";
		String actualTitle = "";

		WebDriver driver = new ChromeDriver();
		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);

		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expctedTitle)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed");
		}

		// Close Chrome browser
		driver.close();
	}

}
