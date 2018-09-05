package packageOne;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoguru99 {
		WebDriver driver;
		
@BeforeTest
public void navigategoogle() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/v4/");
}

@Test
public void navigateguru99() {
	/*driver.findElement(By.id("lst-ib")).sendKeys("demo.guru99.com/v4");
	driver.findElement(By.linkText("Guru99 bank. - here")).click();*/
	driver.findElement(By.linkText("here")).click();
	
	String webTitle = driver.getTitle();
	
	Assert.assertEquals(webTitle, "Guru99 Bank Home Page");
	
}

@AfterTest
public void quit(){
	driver.close();
	driver.quit();
}

}