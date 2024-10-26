package saucecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class saucedemo11 {

	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		
		driver=new ChromeDriver();
		
	   driver.get("https://www.saucedemo.com/");
     	driver.manage().window().maximize();
    	Thread.sleep(3000);
	}
    	@Test(priority=2)
    	public void VerifyUrl() {
    		String expectedurl=
    		"https://www.saucedemo.com/";
    		
    		String actualurl=driver.getCurrentUrl();
    		
    		if(expectedurl.equals(actualurl)) {
    		System.out.println("The url is correct");	
    		}else {
    			System.out.println("url is not correct");
    		}
    	}
    	@Test(priority=1)
    	public void VerifyLogin()throws InterruptedException{
    		
    		WebElement ele=driver.findElement(By.id("user-name"));
    		ele.sendKeys("standard_user");
    		Thread.sleep(2000);
    		
    		WebElement ele1=driver.findElement(By.id("password"));
    		ele1.sendKeys("secret_sauce");
    		Thread.sleep(2000);
    		
    		driver.findElement(By.id("login-button")).click();
    		
    	}
    	@AfterMethod
    	public void teardown()throws InterruptedException{

    		Thread.sleep(3000);
    	

	
	Thread.sleep(3000);
	driver.close();
}

}

	


