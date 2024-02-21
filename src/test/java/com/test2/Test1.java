package com.test2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException  {

//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver3 = new EdgeDriver();
		driver3.get("https://www.facebook.com/login/");

	    driver3.manage().window().maximize();

		String title = driver3.getTitle();
 	    System.out.println(title);
//
		String currentUrl = driver3.getCurrentUrl();
		System.out.println(currentUrl);
	    Thread.sleep(2000);
//
		driver3.navigate().to("https://mvnrepository.com/");
		Thread.sleep(4000);
//
		String title2 = driver3.getTitle();
		System.out.println(title2);
		
	
//
		driver3.navigate().back();
		Thread.sleep(4000);
//
		driver3.navigate().forward();
		Thread.sleep(2000);
//
 	driver3.navigate().refresh();
//
		driver3.close();


	}

}
