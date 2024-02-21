package com.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData2 {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\91976\\eclipse-workspace\\Automation3\\TestData\\data2.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		String data1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		String data2 = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data2);
		String data3 = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(data3);
		String data4 = wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data4);
		String data5 = wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		System.out.println(data5);
		String data6 = wb.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		System.out.println(data6);
		String data7 = wb.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
		System.out.println(data7);
		String data8 = wb.getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
		System.out.println(data8);
		String data9 = wb.getSheet("Sheet1").getRow(8).getCell(0).getStringCellValue();
		System.out.println(data9);
		String data10 = wb.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
		System.out.println(data10);
		String data11 =wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
		System.out.println(data11);

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys(data1);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys(data2);
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys(data3);
		WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
		email.sendKeys(data4);
		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys(data5);
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys(data6);
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys(data7);
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.sendKeys(data8);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(data9);
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(data10);
		WebElement confirmpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpass.sendKeys(data11);
		
		
		
		
	}

}
