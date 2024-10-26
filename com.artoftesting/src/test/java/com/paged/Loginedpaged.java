package com.paged;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginedpaged {
	
	  WebDriver driver;

			public void LoginPage(WebDriver ldriver) {
				this.driver = ldriver;
			}
			@FindBy(id="Text-Box")
			WebElement Tbox;
			
			@FindBy(id ="Button")
			WebElement Bsumit;
			
			public void loginToartoftesting(String username, String password) {
			
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException A) {
						
						A.printStackTrace();
					}
			}
}
