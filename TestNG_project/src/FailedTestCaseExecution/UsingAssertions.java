package FailedTestCaseExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingAssertions {

	@Test
	public void Test1() {
		System.out.println("test1");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2() {
		System.out.println("test2");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void Test3() {
		System.out.println("test3");
		Assert.assertEquals(true, true);
	}
}
