package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewTest {

	WebDriver driver, driver2, driver3;
	
	@Test
	public void facebookTest() {
		String url2 = "https://www.facebook.com";
		driver2.get(url2);
		driver.manage().window().maximize();
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver2.getTitle();
		System.out.println("This testNG is for checking Expected Title is Equals to Actual Title");

		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@Test
	public void googleTest() {

		String url = "https://www.google.com";
		driver.get(url);
		

		// Capturing the title and validating if expected is equal to actual
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println("This testNG is for checking Expected Title is Equals to Actual Title");
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@BeforeMethod
	public void beforeMethod() {
		// Setting up the chrome driver exe, the second argument is the location where
		// you have kept the driver in your system
		System.setProperty("webdriver.chrome.driver", "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe");

		System.out.println("Starting the browser session");
		// Setting the driver to chrome driver
		driver = new ChromeDriver();
		driver2 = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing the browser session");
		driver.close();
		driver2.close();
	}
}