package demononcommerce;


	import java.util.List;
    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class noncommerce {

		public static void main(String[] args) throws InterruptedException {
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/build-your-own-computer");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			Actions act = new Actions(driver);
	         act.sendKeys(Keys.PAGE_DOWN).perform();
	         Thread.sleep(3000);
	         
	         @SuppressWarnings("unchecked")
			List<WebElement>
	         ele=(List<WebElement>) driver.findElement(By.xpath("//input[@type=\"checkbox\" and @name=\"product_attribute_5\"]"));
	         
	         
	         for(WebElement clk:ele) {
	 			Thread.sleep(3000);
	 			clk.click();
	 			
	 		}
	 		Thread.sleep(3000);
	 		driver.close();
	 	}

	 
}
