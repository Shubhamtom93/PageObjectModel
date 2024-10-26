package internetnethero;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herojavascreenshot {

	
		public static void main(String[] args) throws InterruptedException, IOException {

			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().dismiss();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
			Thread.sleep(1000);
		    Alert alert = driver.switchTo().alert();
		    
		    alert.sendKeys("data");
		    Thread.sleep(2000);
		    alert.accept();
			
		    TakesScreenshot sc = ((TakesScreenshot) driver);
			File src = sc.getScreenshotAs(OutputType.FILE);
			File f2 = new File("C:\\screenshot1\\screen.png");
			FileUtils.copyFile(src,f2);
			
			
			
			Thread.sleep(3000);
			driver.close();

		}

	}




