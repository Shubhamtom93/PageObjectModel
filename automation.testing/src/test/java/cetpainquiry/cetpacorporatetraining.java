package cetpainquiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cetpacorporatetraining {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver=new ChromeDriver();
		driver.get("https://www.cetpainfotech.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
@Test()
public void traning()throws InterruptedException{
	WebElement ele = driver.findElement(By.id("txtInqtraningName"));
	ele.sendKeys("Shubham Tomar");
	
	WebElement ele1 = driver.findElement(By.id("txtInqtraningEmail"));
	ele1.sendKeys("1993tomar@gmail.com");
	
	WebElement ele2 = driver.findElement(By.id("txtInqtraningNumber"));
	ele2.sendKeys("9891415006");
	
	WebElement ele3 = driver.findElement(By.id("txtCompanyName"));
	ele3.sendKeys("cetpa infotech pvt.ltd");
	
	
	WebElement ele4 = driver.findElement(By.id("txtCorpMessage"));
	ele4.sendKeys("i am intrested this corporate traning");
	
	 driver.findElement(By.id("btnCorpSubmit")).click();
	}
@AfterMethod
public void teardown()throws InterruptedException{
	Thread.sleep(2000);
	driver.close();
     }
}
