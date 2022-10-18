package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailabel_Report {
	
	@Test
	public void Google_Title()
	{
		System.out.println("@Test ---- Google Title Test");
		Reporter.log("Running test case");
	}
	@Test
	public void SearchPage()
	{
		Reporter.log("Running Search");
		
	}

}
