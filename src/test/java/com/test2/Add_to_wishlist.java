package com.test2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_to_wishlist {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement moblie = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		moblie.click();

		WebElement oneplus = driver.findElement(By.xpath("//span[text()='OnePlus']"));
		oneplus.click();

		WebElement mobile = driver.findElement(
				By.xpath("//span[text()='OnePlus 10R 5G (Forest Green, 8GB RAM, 128GB Storage, 80W SuperVOOC)']"));
		mobile.click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		WebElement cart = driver.findElement(By.xpath("//a[text()=' Add to Wish List ']"));
		Thread.sleep(2000);
		cart.click();
		System.out.println("sign up page display");
		System.out.println("Execution successful");

	}

}
