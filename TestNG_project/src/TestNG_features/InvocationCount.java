package TestNG_features;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=5)
	void count() {
		System.out.println("HI");
	}
}
