package TestNG_Keywords;

import org.testng.annotations.Test;

public class TimeOut_Keyword {

	@Test(timeOut = 1000)
	public void infiniteloop() {
		
		for(;;) {
			
			System.out.println("hello");
		}
	}
}
