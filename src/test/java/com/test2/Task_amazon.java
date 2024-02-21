 package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_amazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement icon=driver.findElement(By.xpath("(//a[text()='Start here.'])[2]"));
		icon.click();
		
		WebElement name=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		name.sendKeys("lalit");
		
		WebElement mobile=driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		mobile.sendKeys("9763515513");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("lalitdudhe09@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("123456");
		
		WebElement button=driver.findElement(By.xpath("//input[@id='continue']"));
		button.click();
		
		
	}

}
