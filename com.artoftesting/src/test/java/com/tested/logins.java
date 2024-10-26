package com.tested;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.Loginpage;
import com.paged.basesclass;

public class logins extends basesclass{
	@Test
	
	public void loginapp() {
		
		Loginpage loginpage =PageFactory.initElements(driver, Loginpage.class);
	}

}
