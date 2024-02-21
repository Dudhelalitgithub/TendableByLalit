package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//  upper case 
		Actions act = new Actions(driver);
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
        act.keyDown(Email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
        
        // select ctrl+a for select 
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        
        // copy ctrl+c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        driver.findElement(By.xpath("//input[@id='pass']")).click();
        
        // paste ctrl+v
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
