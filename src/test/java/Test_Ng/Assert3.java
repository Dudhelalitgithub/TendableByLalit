package Test_Ng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert3 {
	
	@Test
	public void verifyHomePage() {
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("valid UserName");
		System.out.println("Valid Password");
		System.out.println("Click on Login");
		
		
		String Expected="HomePage";
		String Actual="SignUp Page";
		
		soft.assertEquals(Actual, Expected);
		
		System.out.println("Soft Assert");
		
		//soft.assertAll();
	}
		

}
