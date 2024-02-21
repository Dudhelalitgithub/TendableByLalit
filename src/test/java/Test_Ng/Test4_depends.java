package Test_Ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4_depends {

	@Test
	public void verify_login() {
		System.out.println("test login");
	 Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods="verify_login")
	public void verify_HomePage() {
		System.out.println("Test HomePage");
	}
}
