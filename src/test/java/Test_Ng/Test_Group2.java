package Test_Ng;

import org.testng.annotations.Test;

public class Test_Group2 {

	@Test (groups= {"Sanity"})
	public void B1() {
		System.out.println("Test B1");
	}
	
	@Test (groups= {"CriticalRegression"})
	public void B2() {
		System.out.println("Test B2");
	}
	
	@Test (groups= {"CriticalRegression"})
	public void a3() {
		System.out.println("Test B3");
	}
	
	@Test (groups= {"Regression"})
	public void a4() {
		System.out.println("Test B4");
	}
}
