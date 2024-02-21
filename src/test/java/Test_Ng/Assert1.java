package Test_Ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {

	@Test
	public void verifyLogin() {
		
		System.out.println("Valid UserName");
		System.out.println("Valid Password");
		System.out.println("Click on Login");
		
		
		String Expected="HomePage";
		String actual="LoginPage"; //driver.gettitle();
	  
		Assert.assertEquals(actual, Expected);
		
		System.out.println("Fail Assert");
}
}