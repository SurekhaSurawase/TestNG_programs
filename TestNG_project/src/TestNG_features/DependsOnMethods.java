package TestNG_features;

import org.testng.annotations.Test;

public class DependsOnMethods {

	//this keyword is used if one method is dependant on another method
	//means if we declare B() dependent on A(); unless and until A() is executed successfully B() will not be executed.
	
	@Test
	public void LoginPage() {
		System.out.println("This is loginpage");
	}
	
	@Test(dependsOnMethods = "LoginPage")
	public void HomePage() {
		System.out.println("This is Homepage");
	}
	
	@Test(dependsOnMethods = "LoginPage")
	public void Chat() {
		System.out.println("This is Chat");
	}
}
