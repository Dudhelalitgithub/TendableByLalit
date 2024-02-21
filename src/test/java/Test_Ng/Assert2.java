package Test_Ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 {

	@Test
	public void verifyLogin() {
		
		System.out.println("valid UserName");
		System.out.println("Valid Password");
		System.out.println("Click on Login");
		
		
		String Expected="HomePage";
		String actual="HomePage"; //driver.gettitle();
	  
		Assert.assertEquals(actual, Expected);
		
		System.out.println("Pass Assert");
	}	
}
