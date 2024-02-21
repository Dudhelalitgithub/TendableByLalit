package com.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\91976\\eclipse-workspace\\Automation3\\TestData\\data.xlsx";

		// create object of fineinputstream class

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String data0_0 = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0_0);

		String data0_1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data0_1);

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        
       WebElement name= driver.findElement(By.xpath("//input[@id='email']"));
       name.sendKeys(data0_0) ;
        
       WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
       pass.sendKeys(data0_1);
	}

}
