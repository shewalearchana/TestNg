package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Test_Annotation {
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
	
	@Test
	public void kite_login_page_Title()
	{
	String Title = driver.getTitle();
	System.out.println(Title);
	}
	
	@Test
	public void Kite_Logo()
	{
		boolean logo = driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
		System.out.println(logo);
	}
	
	@Test
	public void Forget_User_Test()
	{
		boolean forgot =driver.findElement(By.xpath("//a[@class=\"text-light forgot-link\"]")).isDisplayed();
		System.out.println(forgot);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
