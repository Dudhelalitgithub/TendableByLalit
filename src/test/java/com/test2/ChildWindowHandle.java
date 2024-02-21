package com.test2;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;



public class ChildWindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> ALLID=driver.getWindowHandles();
		System.out.println(ALLID);
		
		List<String> list=new ArrayList(ALLID);
		System.out.println(list.get(0)); // parent
		System.out.println(list.get(1)); //child 
		
		driver.switchTo().window(list.get(1)); // Switch to child window
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("lalit@gmail.com");
		
		driver.close();



		
	}

}
