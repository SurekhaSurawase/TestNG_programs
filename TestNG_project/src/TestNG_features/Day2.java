package TestNG_features;

import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test(groups = {"regression"})
	public void test5() {
		System.out.println("Test5");
	}
	
	@Test
	public void test6() {
		System.out.println("Test6");
	}
}
