package com.test2;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll2 {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		JavascriptExecutor js = driver;
		// WebElement Scroll

		WebElement signin = driver.findElement(By.xpath("//span[@class='action-inner']"));

		js.executeScript("arguments[0].scrollIntoView()", signin);
		signin.click();

	}

}
