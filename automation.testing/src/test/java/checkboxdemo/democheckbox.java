package checkboxdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class democheckbox {

public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/checkboxes");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//xpath excutation time ko increase karta hai ye ek location strategy hai
			// Multiple web element ko store karna ho to List<WebElement>
			List<WebElement>ele=(List<WebElement>) driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
			
			for(WebElement clk:ele) {
				Thread.sleep(3000);
				clk.click();
				}

			
			Thread.sleep(3000);
			driver.close();
		}

	}


