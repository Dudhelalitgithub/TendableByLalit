package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Index_xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")); // by index
		firstname.sendKeys("lalit");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]")); // bu attribute
		lastname.sendKeys("dudhe");
		
		
	}

}
