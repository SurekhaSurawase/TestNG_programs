package TestNG_features;

import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
}
