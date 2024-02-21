package com.test2;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ScrollTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		//scroll pixel
		JavascriptExecutor js=driver;
		// top bottom
		js.executeScript("window.scrollBy(0,600)","");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-600)", "");
		// bottom top
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
	    
		Thread.sleep(3000); 
		
		js.executeScript("arguments[0].scrollIntoView()", button);
		button.click();
		
		
		
	}

}
