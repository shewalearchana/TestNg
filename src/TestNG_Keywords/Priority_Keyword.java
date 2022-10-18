package TestNG_Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_Keyword {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test(priority = 3)
	public void Kite_Login_Title()
	{
		String title =driver.getTitle();
		System.out.println("Login Page Title :"+title);
	}
	
	@Test (priority = 1)
	public void Kite_Logo_Test()
	{
		boolean logo = driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
		System.out.println("Logo Display :"+logo);
	}
	
	@Test(priority = 2)
	public void Forget_User_Test()
	{
		boolean forgot =driver.findElement(By.xpath("//a[@class=\"text-light forgot-link\"]")).isDisplayed();
		System.out.println("Forgot Link : "+forgot);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
