package demoblaze1;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import demoblaze.basedclass;
import demoblaze.Signuppage;

public class Logins extends basedclass {
	
	@Test
	public void loginapp() {
		
		 Signuppage loginpage =PageFactory.initElements(driver, Signuppage.class);
		loginpage.SignupTodemoblaze("Shubhamtom93","123456");
		
	}
	
	

}
