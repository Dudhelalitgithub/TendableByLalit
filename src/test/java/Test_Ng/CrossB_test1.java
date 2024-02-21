package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CrossB_test1 extends BaseClass {

	@Test
	public void SignUp() {
		System.out.println("SignUp Page");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("test@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345");
		WebElement btn_login = driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		btn_login.click();
	}

	@Test
	public void CreateAccount() {
		System.out.println("Create Account");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();

	} 

	@Test
	public void ForgottenPassword() {

		WebElement forgotten = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		forgotten.click();
	}
}
