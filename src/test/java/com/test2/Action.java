package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		// WebElement bank=driver.findElement(By.xpath("(//a[@class='button
		// button-orange'])[5]"));
		// act.moveToElement(bank).build().perform();

		//WebElement RightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.contextClick(RightClickEle).build().perform();

		//WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
		//quit.click();

		//driver.switchTo().alert().accept();
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleclick).build().perform();
		//driver.switchTo().alert().accept();
		
	}

}
