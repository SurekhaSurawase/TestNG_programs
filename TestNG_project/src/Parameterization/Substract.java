package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Substract {

	@Parameters({"A","B"})
	@Test
	public void sum(int A, int B) {
		int c=A-B;
		System.out.println(c);
	}
}
