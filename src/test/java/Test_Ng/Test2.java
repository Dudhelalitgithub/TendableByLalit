package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	ChromeDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test (priority=2)
	public void fb_login() {

		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("test@gmail.com");

		WebElement txt_pass = driver.findElement(By.xpath("//input[@name='pass']"));
		txt_pass.sendKeys("12345");

		WebElement btn_login = driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
	}

	@Test (priority=1)
	public void Create_Account() {
		WebElement create = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		create.click();
	}
	
	@Test (priority=3)
	public void Forgotten_password () {
    WebElement click1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
    click1.click();
	}
	
	
	@AfterMethod
	public void TeardDown() {
		//driver.close();
	}

}
