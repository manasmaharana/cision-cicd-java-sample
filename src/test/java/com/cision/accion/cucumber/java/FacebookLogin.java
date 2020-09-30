package com.cision.accion.cucumber.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	WebDriver driver = null;
	String baseUrl = "https://www.google.com";

	@Given("^I have open the browser$")
	public void openBrowser() {
		// This is for windows
//		 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/windows/chromedriver.exe");
		// This is for Linux and only mean for testing CI/CD
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/linux/chromedriver");

		WebDriverManager.chromedriver().version("85.0.4183.87").setup();
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("enable-automation");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-infobars");
	    chromeOptions.addArguments("–-disable-dev-shm-usage");
	    chromeOptions.addArguments("--disable-browser-side-navigation");
	    chromeOptions.addArguments("--disable-gpu");
		driver = new ChromeDriver(chromeOptions);

//		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@When("^I open Facebook website$")
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}

	@Then("^Login button should exits$")
	public void loginButton() {
		if (driver.findElement(By.id("u_0_3")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		driver.close();
	}
}
