package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_locator {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.name("UserFirstName"));
		firstname.sendKeys("lalit");
		
		WebElement lastname=driver.findElement(By.name("UserLastName"));
		lastname.sendKeys("dudhe");
		
		
		
		
	}

}
