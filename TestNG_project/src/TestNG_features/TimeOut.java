package TestNG_features;

import org.testng.annotations.Test;

public class TimeOut {

	//timeout keyword is used if code goes in infinite loop or one of the TC takes long time to execute.
	@Test(timeOut=5000)
	public void Test1() {
		for(;;) {
			System.out.println("Hi");
		}
		//System.out.println("complete");
	}
	
	@Test
	public void Test2() {
		System.out.println("test2 method");
	}
}
