package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args)throws  InterruptedException {
		//1. set up browser
		WebDriver  driver = new ChromeDriver();
		
		//2.Launch the browser
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 String expectedurl="https://www.saucedemo.com/";
		 String actualurl=driver.getCurrentUrl();
		 
		 if(expectedurl.equals(actualurl)) {
			System.out.println("Correct Page"); 
		 }else {
			 System.out.println("Invalid Page");
		 }
		 
		  WebElement username=driver.findElement(By.id("user-name"));
		  username.sendKeys("standard_user");
		  Thread.sleep(3000);
		  
		  WebElement password=driver.findElement(By.id("password"));
		  password.sendKeys("secret_sauce");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(3000);
		  
		  
		  
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  driver.navigate().refresh();		  
		  
		  // 3. close browser 
		 Thread.sleep(3000);
		 driver.close();
		 

	}

	


	}


