package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsermanufacturing {
	
	public static WebDriver startapplication(WebDriver driver ,String browserName,String appurl) {
		if (browserName.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else {
			System.out.println("False Driver");
		}
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get(appurl);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			return driver;
		}
			public static void quitBrowser(WebDriver driver) {
				driver.close();
			}
		}



