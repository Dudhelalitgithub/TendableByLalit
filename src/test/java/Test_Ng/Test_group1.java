package Test_Ng;

import org.testng.annotations.Test;

public class Test_group1 {

	@Test (groups= {"Sanity"})
	public void a1() {
		System.out.println("Test a1");
	}
	
	@Test (groups= {"Sanity"})
	public void a2() {
		System.out.println("Test a2");
	}
	
	@Test (groups= {"CriticalRegression"})
	public void a3() {
		System.out.println("Test a3");
	}
	
	@Test (groups= {"Regression"})
	public void a4() {
		System.out.println("Test a4");
	}
}
