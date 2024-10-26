package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.Baseclass;
import com.page.Loginpage;

public class login extends Baseclass {
	
	@Test
	public void loginapp()  {
   
		// * This method will attempt to instantiate the class given to it, preferably using a help of  constructor
       // * which takes a WebDriver instance as its only argument or falling back on a no-arg constructor.
      //* An exception will be thrown if the class cannot be instantiated.
		Loginpage loginpage =PageFactory.initElements(driver, Loginpage.class);
		loginpage.loginToSaucedemo("standard_user", "secret_sauce");
    }
}	
  