package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_xpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.manage().window().maximize();
		
		// identify element.....> Relative xpath....> attribute
		// tagname[@attribute='value']
		
		WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("lalit@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345");
		
		//WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		//login.click();
		
		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot.click();
		
		
	}

}
