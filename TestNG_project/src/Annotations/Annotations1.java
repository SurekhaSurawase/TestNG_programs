package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {

	//to run testNG program we dont need main(). main method will be automatically called at back end by JVM.
	
	//Annotations are piece of code that are inserted into the program which controls flow of exeution of program.
	//there are diff annotation in TestNG like precondition and postcondition annotations.
	
	//1. @BeforeSuite
	//2. @BeforeTest
	//3. @BeforeClass
	//4. @BeforeMethod
	//5. @AfterMethod
	//6. @AfterClass
	//7. @AfterTest
	//8. @AfterSuite
	//9. @parameters
	//10. @DataProvider
	
	@BeforeSuite
	public void SetUp() {
		System.out.println("@BeforeSuite=====>SetUp");
	}
	
	
	@BeforeTest
	public void URL() {
		System.out.println("@BeforeTest=====>URL");
	}
	
	@Test
	public void GetTitle1() {
		System.out.println("GetTitle1");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("@BeforeClass=====>LaunchBrowser");
	}
	
	
	@BeforeMethod
	public void Login() {
		System.out.println("@BeforeMethod=====>Login");
	}
	

	@Test
	public void GetTitle2() {
		System.out.println("GetTitle2");
	}
	@AfterClass
	public void CloseBrowser() {
		System.out.println("@AfterClass=====>CloseBrowser");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("@AfterTest=====>Delete cookies");
	}
	
	@AfterSuite
	public void Logout() {
		System.out.println("@AfterSuite=====>LogOut");
	}
}
