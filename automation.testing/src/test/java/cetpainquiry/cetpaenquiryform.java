package cetpainquiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cetpaenquiryform {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver=new ChromeDriver();
		driver.get("https://www.cetpainfotech.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test()
	public void Enquiry()throws InterruptedException{
		 driver.findElement(By.xpath("//*[@id=\"text-9\"]/div/p/a[1]")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("txtInqPopName"));
		ele.sendKeys("Shubham Tomar");
		
		WebElement ele1 =driver.findElement(By.id("txtInqPopEmail"));
		ele1.sendKeys("1993tomar@gmail.com");
		
		WebElement ele2 =driver.findElement(By.id("txtInqPopPhone"));
		ele2.sendKeys("9891415006");
		
		WebElement drop =driver.findElement(By.id("ddlhomeenquirypopup"));
		Select ele3 = new Select(drop);
		ele3.selectByValue("364");
		
		WebElement ele4=driver.findElement(By.id("txtInqPopMessage"));
		ele4.sendKeys("I am Purchase this cource");
		
		driver.findElement(By.id("buttonEnquiryPopupSubmit")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void teardown()throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}

}

	

