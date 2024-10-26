package artoftesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class artoftestingselinium {

	WebDriver driver;
	@BeforeMethod	
	public void stepup () throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		}

	@Test(priority = 1)
	public void Drop_down() throws InterruptedException {
		WebElement drp = driver.findElement(By.id("testingDropdown"));
		Select ele3= new Select(drp);
		ele3.selectByValue("Automation");
		Thread.sleep(3000);
	}
	

	@Test(priority = 2)
	public void link() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/p[1]/a")).click();
	    Thread.sleep(3000);
	}
	
	
	@Test(priority = 3)
	public void check_box() throws InterruptedException {
		List<WebElement> ele_0 = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(WebElement clik:ele_0) {
			clik.click();
		}
		Thread.sleep(4000);
	}

	@Test(priority = 4)
	public void input_field() throws InterruptedException{
		WebElement ele1 = driver.findElement(By.name("firstName"));
		ele1.sendKeys("tuesday");
		Thread.sleep(2000);
		driver.findElement(By.id("idOfButton")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void alert_box() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	    
	@AfterMethod
	          
	     
	     public void teardown() throws InterruptedException {
		       
	    	 Thread.sleep(4000);
		    driver.close();
	}
	
	
}

