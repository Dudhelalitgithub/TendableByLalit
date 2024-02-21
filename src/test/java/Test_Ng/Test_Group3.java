package Test_Ng;

import org.testng.annotations.Test;

public class Test_Group3 {

	@Test (groups= {"Regression"})
	public void C1() {
		System.out.println("Test C1");
	}
	
	@Test (groups= {"CriticalRegression"})
	public void C2() {
		System.out.println("Test C2");
	}
	
	@Test (groups= {"CriticalRegression"})
	public void C3() {
		System.out.println("Test C3");
	}
	
	@Test (groups= {"Regression"})
	public void C4() {
		System.out.println("Test C4");
	}
}
