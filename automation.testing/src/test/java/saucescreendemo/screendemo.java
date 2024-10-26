package saucescreendemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screendemo {

	
		public static void main(String[] args) throws InterruptedException, IOException {

			WebDriver driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement ele = driver.findElement(By.id("user-name"));
			ele.sendKeys("standard_user");
			Thread.sleep(3000);
			
			WebElement ele1 =driver.findElement(By.id("password"));
			ele1.sendKeys("secret_sauce");
			Thread.sleep(3000);
			
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("checkout")).click();
			Thread.sleep(3000);
			
			WebElement firstn = driver.findElement(By.id("first-name"));
			firstn.sendKeys("Shubham");
			Thread.sleep(3000);
			
			WebElement lastn =driver.findElement(By.id("last-name"));
			lastn.sendKeys("Tomar");
			Thread.sleep(3000);
			
			WebElement pin= driver.findElement(By.id("postal-code"));
			pin.sendKeys("201013");
			Thread.sleep(3000);
			
			driver.findElement(By.id("continue")).click();
			Thread.sleep(3000);
			
			// Shreenshot ke lye
			TakesScreenshot sc = ((TakesScreenshot) driver);
			File src = sc.getScreenshotAs(OutputType.FILE);
			File f2 = new File("C:\\screenshot\\screen.png");
			FileUtils.copyFile(src,f2);
			
			
			
			Thread.sleep(3000);
			driver.close();


	}

}
