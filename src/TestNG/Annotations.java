package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	/*@BeforeSuite
	@BeforeTest
	@BeforeClass
	
	
	
	@BeforeMethod
	@Test
	@AfterMethod
	
	
	@BeforeMethod
	@Test
	@AfterMethod
	
	@AfterClass
	@AfterTest
	*/
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("@BeforeSuite =====> Setup system property");
	}
	
	@BeforeTest
	public void LaunchBrowser()
	{
		System.out.println("@BeforeTest ====> Launching browser");
	}
	
	@BeforeClass
	public void URL()
	{
		System.out.println("@BeforeClass ===>Enter URL");
	}
	@BeforeMethod  //4   //7   //10
	  public void Login() {
		  System.out.println("@BeforeMethod --- Logint oto application");
	  }
	 
	   // TestClass - Starts with @Test
	@Test  //5
	   public void GoogleTitle() {
		   System.out.println(" @Test---- Google Title");
	   }
	 @Test   //8
	   public void GoogleLogo() {
		   System.out.println(" @Test -- Google logo");		   
	   }
	 @Test  //11
	   public void Demo() {
		   System.out.println("Demo test");
	   }
	   
	  // PostCondtion - starts with @after
	  @AfterMethod    //6  //9 //12
	  public void Logout() {
		  System.out.println("@AfterMethod -- Logout from applicaton");
	  }
	  
	  @AfterClass   //13
	  public void closebrowser() {
		  System.out.println("  @AfterClass Close browser");
	  }
	  
	  @AfterTest  //14
	  public void deletecookies() {		  
		  System.out.println("  @AfterTest --Delete cookies");
	  }
	  
	  @AfterSuite  //15
	  public void DD() {
		  System.out.println(" @AfterSuite ---Demp");
	  }
	

}
