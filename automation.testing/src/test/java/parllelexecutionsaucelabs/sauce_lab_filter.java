package parllelexecutionsaucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sauce_lab_filter {
	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver= new EdgeDriver();
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
	public void filter ()throws InterruptedException{
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Thread.sleep(2000);
		Select ele= new Select(drop);
		ele.selectByValue("za");
		
}
	@AfterMethod
	public void teardown()throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}

}
