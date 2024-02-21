package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement drowpdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(drowpdown);

		select.selectByIndex(2); // select by index

		select.selectByVisibleText("INDIA"); // select by visible text

		select.selectByValue("BRAZIL"); // select by value

		List<WebElement> list = select.getOptions(); // DropDown count
		System.out.println(list.size());
		

		for (int i = 0; i < list.size(); i++) {

			String option = list.get(i).getText();
			System.out.println(option);

			if (option.equals("CUBA"))
				;
			list.get(i).click();
			break;

		}

	}

}
