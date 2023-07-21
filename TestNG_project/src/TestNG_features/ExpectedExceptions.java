package TestNG_features;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions= ArithmeticException.class)
	public void number() {
		int num=10;
		System.out.println(num);
		num=10/0;
//		try {
//			num=10/0;
//		} catch (ArithmeticException e) {
//			
//		} 
	
	}
}
