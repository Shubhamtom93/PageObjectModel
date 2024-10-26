package cetpainquiry;


	import java.io.File;

	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class cetpaform {

		public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cetpainfotech.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
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
		
		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\screenshot\\screen.png");
		FileUtils.copyFile(src,f2);
		
	    
		
		Thread.sleep(3000);
		driver.close();
		}

	}



