package demoblaze;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import demoblaze2.browserindustry;
public class basedclass {
	
	public WebDriver driver;
 @BeforeClass
 public void setup()throws InterruptedException {
	 driver=browserindustry.startapplication(driver, "Chrome", "https://demoblaze.com/");
	 
 }
 @AfterClass
 public void teardown() throws InterruptedException {
	 Thread.sleep(2000);
		browserindustry.quitbrowser(driver);
 }
}
