package packageOne;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class login {
	WebDriver driver;
	
	public void loginpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://demo.guru99.com/v4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr136913");
		driver.findElement(By.name("password")).sendKeys("YbEhege");
		driver.findElement(By.name("btnLogin")).click();
		
		String webTitle = driver.getTitle();
		
		Assert.assertEquals(webTitle, "Guru99 Bank Manager HomePage");
		
		driver.close();
		driver.quit();
	}
	
}
