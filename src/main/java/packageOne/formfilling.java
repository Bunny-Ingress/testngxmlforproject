package packageOne;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class formfilling {

	WebDriver driver;
	
	@BeforeTest
	public void navigate () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhani\\Downloads\\Selinium\\chrome\\chromedriver.exe");
	driver = new ChromeDriver ();
	driver.get("https://demo.guru99.com/v4/");
	
	driver.findElement(By.name("uid")).sendKeys("mngr136913");
	driver.findElement(By.name("password")).sendKeys("YbEhege");
	driver.findElement(By.name("btnLogin")).click();

	}
	
	@Test
	public void fill () {
		
	driver.findElement(By.linkText("New Customer")).click();
	driver.findElement(By.name("name")).sendKeys("Prabhani");
	driver.findElement(By.xpath("//td/input[@ value='f']")).click();
	driver.findElement(By.xpath("//td/input[@ type='date']")).click();
	driver.findElement(By.name("addr")).sendKeys("12,Test, test road test city");
	driver.findElement(By.name("city")).sendKeys("test city");
	driver.findElement(By.name("state")).sendKeys("test state");
	driver.findElement(By.name("pinno")).sendKeys("1234");
	driver.findElement(By.name("telephoneno")).sendKeys("+94772789029");
	driver.findElement(By.name("emailid")).sendKeys("test@test.com");
	driver.findElement(By.name("password")).sendKeys("!QAZ1qaz");
	
	driver.findElement(By.name("sub")).click();
	
	}
	
	@AfterTest
	public void finish() {
		driver.close();
		driver.quit();
	}

}
