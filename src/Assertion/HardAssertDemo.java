package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {

	@Test
	public void Demo_Test()
	{
		Assert.assertTrue(true);
	//	Assert.assertFalse(false);
		System.out.println("Good Evening");
		Assert.assertEquals("Welcome", "Welcome");
		System.out.println("Hello");
		
		Assert.assertEquals("Selenium", "Sel");
		
		Assert.assertEquals("Java", "Java");
		System.out.println("Hello");
		
		System.out.println("Succefully passed Demo_test()");
		System.out.println();
	}
	@Test
	public void Demo_Test1()
	{
		Assert.assertTrue(true);
	//	Assert.assertFalse(false);
			
		Assert.assertEquals("Java", "Java");
		System.out.println("Hello");
		
		System.out.println("Succefully passed Demo_test1()");
		System.out.println();
	}
}
