package TestNG_features;

import org.testng.annotations.Test;

public class EnableOrDiasble {
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("This is test1 method");
	}
	
	@Test(enabled = true)//3
	public void test2() {
		System.out.println("This is test2 method");
	}
	@Test(enabled=false)//4
	public void test3() {
		System.out.println("This is test3 method");
	}
	@Test(enabled = true) //2
	public void test4() {
		System.out.println("This is test4 method");
	}
	@Test(enabled=false)
	public void test5() {
		System.out.println("This is test5 method");
	}
	@Test(enabled = true)
	public void test6() {
		System.out.println("This is test6 method");
	}
}
