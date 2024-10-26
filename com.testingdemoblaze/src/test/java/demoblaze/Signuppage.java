package demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signuppage {
	WebDriver driver;
	
	public void LoginPage (WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id ="signin2")
	WebElement snamed;
	
	@FindBy(id ="sign-username")
	WebElement suname;
	
	@FindBy(id ="sign-password")
	WebElement spassword;
	
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	WebElement button;

	public void SignupTodemoblaze(String username, String password) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException I) {
			I.printStackTrace();
		}
		snamed.sendKeys("signin2");
		suname.sendKeys("sign-username");
		spassword.sendKeys("sign-password");
		button.click();
		
}
}