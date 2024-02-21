package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
		firstname.sendKeys("lalit");

		WebElement Dropdate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(Dropdate);
		select.selectByIndex(9);

		WebElement dropmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select1 = new Select(dropmonth);
		select1.selectByIndex(2);

		WebElement dropyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select2 = new Select(dropyear);
		select2.selectByIndex(12);

	}

}
