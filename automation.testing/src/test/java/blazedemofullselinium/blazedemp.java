package blazedemofullselinium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class blazedemp {

	WebDriver driver;
	@BeforeMethod
	public void setup()throws InterruptedException{
		driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void verifysignup()throws InterruptedException{
		
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(3000);
		
		WebElement ele =driver.findElement(By.id("sign-username"));
		ele.sendKeys("Shubhamtom93");
		Thread.sleep(2000);
		
		WebElement ele1 =driver.findElement(By.id("sign-password"));
		ele1.sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test(priority=2)
	public void login()throws InterruptedException{
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		
		WebElement ele2 =driver.findElement(By.id("loginusername"));
		ele2.sendKeys("Shubhamtom93");
		Thread.sleep(2000);
		
		WebElement ele3 =driver.findElement(By.id("loginpassword"));
		ele3.sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout2")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void add_to_cart()throws InterruptedException{
		driver.findElement(By.linkText("Samsung glaxy s6")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(3000);
		}
		@Test(priority = 4)
		public void PlaceOrder() throws InterruptedException {
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Shubham");
		Thread.sleep(3000);
		driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys("Ghaziabad");
		Thread.sleep(3000);
		driver.findElement(By.id("card")).sendKeys("2345678");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("11");
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys("2027");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);	
		}
		@AfterMethod
		public void teardown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}
		
	}





