package com.test_login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.FB_login_Pom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_login2 {

	@Test
	public void FB_login() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FB_login_Pom login=PageFactory.initElements(driver, FB_login_Pom.class);
		login.getText_Email().sendKeys("lalit@gmail.com");
		login.getText_Pass().sendKeys("123456");
		login.getButton_login().click();
		
	}
}
