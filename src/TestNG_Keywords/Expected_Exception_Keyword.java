package TestNG_Keywords;

public class Expected_Exception_Keyword {

	//Q - if u want to handle exception without try catch block so how  will u handle it.
	//and - ExpectedExceptions = Exceptiontype.class

		@org.testng.annotations.Test(expectedExceptions = NullPointerException.class)
		
		public void Test() {
			System.out.println("Handle arithmatic exception");
			String s = null;
			s.length();
			//Integer.parseInt(s);
			//int i=10/0;  
		}
}
