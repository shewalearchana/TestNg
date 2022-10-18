package ParallelTesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	@Test
	public void Module1_Setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.quit();
	}
	
	
	
	
	

}