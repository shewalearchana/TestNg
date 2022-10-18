package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kite_With_TestNG {
	
	
	@Test
	public void LaunchingBrowser1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
	}
	@Test
	public void LunchingBrowser2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

}
