package TestNG_Keywords;

import org.testng.annotations.Test;

public class DependsOn_Keyword {

	@Test
	public void LoginTest(){
		int i=10;
	}
	@Test(dependsOnMethods = "LoginTest")
	public void Homepage() {
		System.out.println("Home page");
	}
	@Test
	public void Searchpage() {
		System.out.println("Searchpage");
	}
	@Test(dependsOnMethods = "LoginTest")
	public void Titlepage() {
		System.out.println("Title page");
	}
}
