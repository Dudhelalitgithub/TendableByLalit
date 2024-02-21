package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//identify element....reletive x-path.....attribute
		
		//tagname[@attribute name='value']
		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']")); 
		txt_email.sendKeys("test@gmail.com");

		WebElement txt_pass = driver.findElement(By.xpath("//input[@name='pass']"));
		txt_pass.sendKeys("12345");

		WebElement btn_login = driver.findElement(By.xpath("//button[@name='login']"));
		// btn_login.click();
		
		 //tagname[taxt()='taxt value']   identity using text
		WebElement forgotLink = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		forgotLink.click();
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signup.click();
	}

}
