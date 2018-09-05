
package packageOne;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test; 

public class searchgoogle {

		WebDriver driver;
@Test
	public void test() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.lk/");
			
			driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
			driver.findElement(By.name("btnK")).click();
			driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	
			String webTitle =driver.getTitle();
			
			Assert.assertEquals(webTitle, "Selenium - Web Browser Automation");
			
			driver.close();
			driver.quit();
			
}

}
