package com.test2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//screen shot of full page
		
		TakesScreenshot ts= driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\91976\\eclipse-workspace\\Automation3\\test.png");
		FileUtils.copyDirectory(scr, destination);
		
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File src1=logo.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\91976\\eclipse-workspace\\Automation3\\logo.png");
		FileUtils.copyFile(src1, destination1);
	}

}
