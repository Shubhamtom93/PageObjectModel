package com.paged;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utilities.browsermanufacturing;

public class basesclass {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver =browsermanufacturing.startapplication(driver, "Chrome", "https://artoftesting.com/samplesiteforselenium");
	}
	@AfterClass
	public void teardown() {
		browsermanufacturing.quitBrowser(driver);
	}
	}



