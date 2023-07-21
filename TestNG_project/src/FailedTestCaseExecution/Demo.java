package FailedTestCaseExecution;

import org.testng.annotations.Test;

import graphql.Assert;

public class Demo {

	@Test
	public void Test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}

	@Test
	public void Test2() {
		System.out.println("test2");
		Assert.assertTrue(false);
	}

	@Test
	public void Test3() {
		System.out.println("test3");
		Assert.assertTrue(true);
	}
}
