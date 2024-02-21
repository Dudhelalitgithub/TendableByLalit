package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// identify by x-path by attribute
		
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("lalit");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("dudhe");
		
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9763515513");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("lalitdudhe09@gmail.com");
		
		WebElement Address=driver.findElement(By.xpath("//input[@name='address1']"));
		Address.sendKeys("ambika nager darwha");
		
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Yavatmal");
		
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharashtra");
		
		WebElement code=driver.findElement(By.xpath("//input[@name='postalCode']"));
		code.sendKeys("445202");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("lalit@123");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123@123");
		
		WebElement confirmpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpass.sendKeys("123@123");
		
	}

}
