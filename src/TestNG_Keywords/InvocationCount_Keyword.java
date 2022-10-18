package TestNG_Keywords;

import org.testng.annotations.Test;

public class InvocationCount_Keyword {

	@Test(invocationCount=20) //used to repeated code like for loop
	public void Addition() {
		
		int a=20;
		int b=15;
		int c = a+b;
		System.out.println("Sum = :"+c);
	}
}
