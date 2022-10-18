package Data_Provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_DemoWeb {

	WebDriver driver;
	@Test(dataProvider = "LoginData")
	public void LoginToWeb(String Username ,String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'PaulTheresiaSiwon CollingsRumapeaPasaribu')]")).isDisplayed());	
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] LoginTestData()
	{
		Object data[][]= new Object[4][2];
		
//		Username & Password = Correct
		
		data[0][0] = "Admin";
		data[0][1]= "admin123";
		
//		Incorrect Username & Correct Password 
		
		data[1][0] = "Admin12";
		data[1][1]= "admin123";
		
//		correct Username & InCorrect Password 
		
		data[2][0] = "Admin";
		data[2][1]= "admin1234";
		
//		Incorrect Username & InCorrect Password 
		
		data[3][0] = "Admin12";
		data[3][1]= "admin1234";
		
		return data;
		
	}
}
