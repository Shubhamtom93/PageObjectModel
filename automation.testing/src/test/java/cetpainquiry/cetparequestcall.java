package cetpainquiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cetparequestcall {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver=new ChromeDriver();
		
	driver.get("https://www.cetpainfotech.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	@Test()
	public void request_call()throws InterruptedException{
		WebElement ele= driver.findElement(By.id("txtFooterName"));
		ele.sendKeys("Shubham");
		
		WebElement ele1= driver.findElement(By.id("txtInqFooterPhone"));
		ele1.sendKeys("9891415006");
		
		driver.findElement(By.id("buttonFooterSubmit")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown()throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}
}
