package orangeHRM;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrmwindowhandle {

	

		public static void main(String[] args) throws InterruptedException, IOException {

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			Set<String> windowid =driver.getWindowHandles();
			
			
			List<String> windowlist = new ArrayList<String>(windowid);
			
			String pwindow =windowlist.get(0);
			System.out.println("Parentwindow=:"+pwindow);
			
			String cwindow = windowlist.get(1);
			System.out.println("Childwindow="+cwindow);
			
			driver.switchTo().window(pwindow);
			Thread.sleep(4000);
			
			
			driver.switchTo().window(cwindow);
			Thread.sleep(4000);
			
			TakesScreenshot sc = ((TakesScreenshot) driver);
			File src = sc.getScreenshotAs(OutputType.FILE);
			File f2 = new File("C:\\screenshot1\\screen.png");
			FileUtils.copyFile(src,f2);
			
			
			Thread.sleep(3000);
			driver.quit();
			

		}

	}


