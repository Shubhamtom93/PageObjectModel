package saucebeforeandafter;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class sauceseliniumdemo {

		
			
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
			@Test(priority=1)
			public void filter ()throws InterruptedException{
				WebElement drop=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
				Thread.sleep(2000);
				Select ele= new Select(drop);
				ele.selectByValue("ZA");
				
			}
			@Test(priority=2)
			public void Add_to_Cart()throws InterruptedException{
				driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				Thread.sleep(2000);
			}
			@Test(priority=3)
			public void remove_from_cart()throws InterruptedException{
				driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("remove-sauce-labs-backpack")).click();
				Thread.sleep(2000);
			}
			@Test(priority=4)
			public void checkout()throws InterruptedException{
				driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.id("checkout")).click();
				Thread.sleep(3000);
				
				WebElement firstname=driver.findElement(By.id("first-name"));
				firstname.sendKeys("Shubham");
				Thread.sleep(3000);
				
				WebElement lastname=driver.findElement(By.id("last-name"));
				lastname.sendKeys("Tomar");
				Thread.sleep(2000);
				
				WebElement pincode=driver.findElement(By.id("postal-code"));
				pincode.sendKeys("201013");
				Thread.sleep(2000);
				
				driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("finish")).click();			
			}	

		@AfterMethod
		public void teardown()throws InterruptedException{
			Thread.sleep(2000);
			driver.close();
		}


	}



