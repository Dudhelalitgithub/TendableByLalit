package com.test_login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Guru_RegistrationPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru_registration2 {

	@Test
	public void Guru_Registration() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Guru_RegistrationPom Registration=PageFactory.initElements(driver, Guru_RegistrationPom.class);
		Registration.getFirstname().sendKeys("Lalit");
		Registration.getLastname().sendKeys("Dudhe");
		Registration.getPhone().sendKeys("9763515513");
		Registration.getEmail().sendKeys("lalitdudhe09@gmail.com");
		Registration.getAddress().sendKeys("Ambika Nagar Darwha");
		Registration.getCity().sendKeys("Yavatmal");
		Registration.getState().sendKeys("Maharashtra");
		Registration.getCode().sendKeys("445202");
		Registration.getUsername().sendKeys("lalit@123");
		Registration.getPassword().sendKeys("123@123");
		Registration.getConfirm_pass().sendKeys("123@123");
		Registration.getSubmit().click();
	}
}
