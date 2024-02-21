package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2_amazon {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement moblie=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		moblie.click();
		
		WebElement oneplus=driver.findElement(By.xpath("//span[text()='OnePlus']"));
		oneplus.click();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)");
		
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		submit.click();
	}

}