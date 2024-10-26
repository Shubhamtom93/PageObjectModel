package parllelexecutionsaucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sauce_lab_product_purchase {
	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver= new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
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
public void checkout()throws InterruptedException{
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	
	WebElement fname=driver.findElement(By.id("first-name"));
	fname.sendKeys("Shubham");
	Thread.sleep(2000);
	
	WebElement lname=driver.findElement(By.id("last-name"));
	lname.sendKeys("Tomar");
	Thread.sleep(2000);
	
	WebElement pin=driver.findElement(By.id("postal-code"));
	pin.sendKeys("201013");
	Thread.sleep(2000);
	
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("finish")).click();
	Thread.sleep(2000);
	
	}

@AfterMethod
  public void teardown()throws InterruptedException{

   Thread.sleep(3000);
    driver.close();
   }
}