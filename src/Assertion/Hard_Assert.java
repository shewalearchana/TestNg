package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class Hard_Assert {

	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	}
	@Test(enabled = true)
	public void UserName()
	{
		WebElement user =driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		WebElement pass = driver.findElement(By.id("password"));
		
		Assert.assertTrue(user.isDisplayed());
		user.sendKeys("GP8097");
		
		
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("gms@0110");
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
//		False Assert
	/*	Assert.assertFalse(user.isDisplayed());
		user.sendKeys("Admin");
		
		Assert.assertFalse(pass.isDisplayed());
		pass.sendKeys("admin123");*/
		
	}
	
	
/*	@Test
	public void OragneHRM()
	{
		WebElement Person_Name=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
		org.testng.Assert.assertTrue(Person_Name.isDisplayed());
		org.testng.Assert.assertEquals(Person_Name,true);
		
	}*/
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
