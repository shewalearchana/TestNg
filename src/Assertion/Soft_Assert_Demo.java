package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Demo {

	SoftAssert softassert = new SoftAssert();
	@Test
	public void demo1()
	{
		softassert.assertEquals("Welcome", "Welcome");
		System.out.println("Execution Start !!!!!");
		softassert.assertEquals("Java", "java");
		System.out.println("Succesfully passed Demo1");
		
		softassert.assertAll();
	}
	
	@Test
	public void Demo2()
	{
		softassert.assertEquals("Archana", "Archana");
		System.out.println("Execute Demo2 Start");
//		softassert.assertTrue(false);
//		softassert.assertTrue(true);
//		softassert.assertEquals(false, true);
		softassert.assertEquals("Python", "Python");
		
		System.out.println("Succefully passed Demo2");
		softassert.assertAll();
		
		
	}
}
