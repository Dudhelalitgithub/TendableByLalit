package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CrossB_test2 extends BaseClass{

	@Test
	public void CreatePage() {
	
	driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
	}
	
	
	@Test 
	public void business() {
		System.out.println("Create Business Account");
	}
	
	

	
	
	
}

