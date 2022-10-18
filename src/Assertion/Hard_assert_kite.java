package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hard_assert_kite {

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

@Test
public void Username() throws InterruptedException {
	
	WebElement Username = driver.findElement(By.xpath("//input[@id=\"userid\"]"));
	WebElement Paswword = driver.findElement(By.xpath("//input[@id=\"password\"]"));

	//AssertTrue		
	Assert.assertTrue(Username.isDisplayed());
	Username.sendKeys("GP8097");
	
	Thread.sleep(2000);
	Assert.assertTrue(Paswword.isDisplayed());
	Paswword.sendKeys("gms@0110");
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	
  //Assertfalse		
	/*Assert.assertFalse(Username.isDisplayed());
	Username.sendKeys("GP8097");
	
	Thread.sleep(2000);
	Assert.assertFalse(Paswword.isDisplayed());
	Paswword.sendKeys("gms@0110");*/
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
//AssertEquals
}

    @Test
	public void Kitelogin() {			
	boolean b = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
	Assert.assertTrue(b);
	Assert.assertEquals(b, true);  //passed  //failed
}
@AfterMethod
public void Teardown() {
	
	driver.quit();
}
}
