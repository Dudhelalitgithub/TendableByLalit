package practice2;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdandName {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Lalit@123");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("123");
		
		WebElement button=driver.findElement(By.name("login"));
		button.click();
		
	}

}
