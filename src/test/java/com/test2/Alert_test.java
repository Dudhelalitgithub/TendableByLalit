package com.test2;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_test {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		// Element identify

		WebElement Customer_id = driver.findElement(By.xpath("//input[@name='cusid']"));
		Customer_id.sendKeys("12345");

		// click on submit button
		WebElement Submit_btn = driver.findElement(By.xpath("//input[@name='submit']"));
		Submit_btn.click();

		// Alert Handle
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());

		// Thread.sleep(3000);
		// alt.dismiss(); // it will click cancel button

		alt.accept(); // it will click ok button

		Thread.sleep(2000);
		System.out.println(alt.getText());

		Thread.sleep(2000);
		alt.accept(); // click OK button

	}

}
