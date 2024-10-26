package herocup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		public class herocup {

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://the-internet.herokuapp.com/checkboxes");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("\"//*[@id=\\\"checkboxes\\\"]/input[1]\")).click();"));
				
				Thread.sleep(3000);
				driver.close();

			}
}


