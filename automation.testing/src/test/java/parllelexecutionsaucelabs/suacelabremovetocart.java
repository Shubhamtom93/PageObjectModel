package parllelexecutionsaucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class suacelabremovetocart {
	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
	}
	@Test()
	public void remove_from_cart()throws InterruptedException{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}
	@AfterMethod
	  public void teardown()throws InterruptedException{

	   Thread.sleep(3000);
	    driver.close();
	   }

}
