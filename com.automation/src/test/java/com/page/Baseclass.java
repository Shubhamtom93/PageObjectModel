package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.BrowserFactory;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
	driver = BrowserFactory.startapplication(driver, "Chrome", "https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
}
