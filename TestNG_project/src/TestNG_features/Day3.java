package TestNG_features;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void test7() {
		System.out.println("Test7");
	}
	
	@Test(groups = {"regression"})
	public void test8() {
		System.out.println("Test8");
	}
	
	@Test
	public void test9() {
		System.out.println("Test9");
	}
}
