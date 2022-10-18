package Parametrization_Using_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import graphql.Assert;

public class Access_Data_Using_Xml_using_Parametr {

	WebDriver driver;
	@BeforeMethod
	@Parameters("URL")
	public void Setup( String URL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	
	@Test
	@Parameters({"Username" ,"Password","Exp"})
	public void LoginTest(String Username ,String Password,String Exp) throws InterruptedException
	{
		WebElement User =driver.findElement(By.id("Email"));
		Thread.sleep(2000);
		User.clear();
		Thread.sleep(2000);
		User.sendKeys(Username);
		
		
		WebElement Pass = driver.findElement(By.id("Password"));
		Thread.sleep(2000);
		Pass.clear();
		Thread.sleep(2000);
		Pass.sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String Exp_Title = "Dashboard / nopCommerce administration";
		String Actual_title = driver.getTitle();
		
		if(Exp.equals("Valid")) {
			if(Exp_Title.equals(Actual_title)) {
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("Pass");
			}
		} else 
			System.out.println("Fail");
		}
		
	
	public void TearDown()
	{
		driver.quit();
	}
	
}
