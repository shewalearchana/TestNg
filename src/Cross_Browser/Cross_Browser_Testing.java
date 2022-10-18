package Cross_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {

	WebDriver driver;
	@Parameters("Browser_Name")
	@Test
	public void BrowserTest(String Browser_Name) throws InterruptedException {
		if(Browser_Name.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browser_Name.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\installer\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'PaulTheresiaSiwon CollingsRumapeaPasaribu')]")).isDisplayed());	
		
		Thread.sleep(2000);
		driver.quit();
	}
}
