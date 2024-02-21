package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggetion {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("Maven");

		Thread.sleep(2000);
		List<WebElement> List = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		System.out.println(List.size());

		for (int i = 0; i < List.size(); i++) {

			String text = List.get(i).getText();

			System.out.println(text);

			if (text.equals("maven dependency")) {
				List.get(i).click();
				break;
			}

		}
	}
}
