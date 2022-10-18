package Data_Provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class Data_Provider_Using_Array_Initialization {

	WebDriver driver;
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	
		
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	}
	@Test(dataProvider = "LoginTest")
	public void Login(String User,String Pass,String Exp) throws InterruptedException
	{
		WebElement Username =driver.findElement(By.id("Email"));
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(2000);
		Username.sendKeys(User);
		
		
		WebElement Password = driver.findElement(By.id("Password"));
		Thread.sleep(2000);
		Password.clear();
		Thread.sleep(2000);
		Password.sendKeys(Pass);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		String Exp_Title = "Dashboard / nopCommerce administration";
		String Actual_title = driver.getTitle();
		
		if(Exp.equals("Valid")) {
			if(Exp_Title.equals(Actual_title)) {
				driver.findElement(By.linkText("Logout")).click();
			}
		} else if(Exp.equals("Invalid"))
		{
			if(Exp_Title.equals(Actual_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}else
			{
				Assert.assertTrue(false);
			}
		}
		
	}
	
	@DataProvider (name = "LoginTest")
	public String[][] GetData()
	{
		String LoginData[][] = {
				{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstoe.com","admin","Invalid"},
				{"admin@yourstore.com","admin11","Invalid"},
				{"admin@yourstore2.com","admin2","Invalid"} 
				              };
		return LoginData;
	}
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
	}
