package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// Drag and Drop
		Actions act=new Actions(driver);
		
		WebElement src= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement destn=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(src, destn).build().perform();
		
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destn2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(src2, destn2).build().perform();
		
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destn3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src3, destn3).build().perform();
		
		WebElement src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destn4=driver.findElement(By.xpath("//li[@class='placeholder']"));
		act.dragAndDrop(src4, destn4).build().perform();
		
	}

}
