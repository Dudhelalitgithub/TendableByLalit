package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_locator {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("9763515513");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("12345");
		
		WebElement clickbutton=driver.findElement(By.id("loginbutton"));
		clickbutton.click();
	}

}
