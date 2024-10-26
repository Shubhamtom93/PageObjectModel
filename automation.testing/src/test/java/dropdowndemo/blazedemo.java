package dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blazedemo {

	public static void main(String[] args) throws InterruptedException{
WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement drop = driver.findElement(By.name("fromPort"));
		
		
		Select ect = new Select(drop);
		ect.selectByValue("Boston");
		Thread.sleep(3000);
		ect.selectByValue("Mexico City");
		
		
         WebElement drop1 = driver.findElement(By.name("toPort"));
		 
		 Select ele1 = new Select(drop1);
		 ele1.selectByValue("Rome");
		 Thread.sleep(3000);
		 ele1.selectByValue("New York");
		 
		 driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("inputName")).sendKeys("Shubham Tomar");
			Thread.sleep(3000);
			
			driver.findElement(By.id("address")).sendKeys("B-65 RK PURAM GHAZIABAD");
			Thread.sleep(3000);
			
			driver.findElement(By.id("city")).sendKeys("GHAZIABAD");
			Thread.sleep(3000);
			
			driver.findElement(By.name("state")).sendKeys("AZ");
			Thread.sleep(3000);
			
			driver.findElement(By.name("zipCode")).sendKeys("85254");
			Thread.sleep(3000);
			
		
			WebElement Drop2=driver.findElement(By.id("cardType"));
			Select ele2 = new Select(Drop2);
			ect.selectByValue("visa");
			Thread.sleep(6000);
			ele2.selectByValue("Amex");
			Thread.sleep(6000);
			
			driver.findElement(By.id("Credit Card No")).sendKeys("4564 4587 4789 1234");
			Thread.sleep(6000);
			
			driver.findElement(By.id("Credit Card Month")).sendKeys("09");
			Thread.sleep(6000);
			
			driver.findElement(By.id("Credit Card Year")).sendKeys("2024");
			Thread.sleep(6000);
			
			driver.findElement(By.id("Name of Card")).sendKeys("Shubham Tomar");
			Thread.sleep(6000);
			
			driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/label")).click();
			Thread.sleep(6000);
			
			driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
			Thread.sleep(6000);
			
			 
		   Thread.sleep(6000);
		   driver.close();
		}


	}


