package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class task_screenshot {

	ChromeDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void fb_login() {

		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("test@gmail.com");

		WebElement txt_pass = driver.findElement(By.xpath("//input[@name='pass']"));
		txt_pass.sendKeys("12345");

		WebElement btn_login = driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
	}

	@Test 
	public void Create_Account() {
		WebElement create = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		create.click();
	 Assert.assertTrue(false);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	
	{
		if (ITestResult.FAILURE == result.getStatus()) {
			String rm = RandomString.make(5);
			String path = "C:\\Users\\91976\\eclipse-workspace\\Automation3";

			TakesScreenshot ts= driver;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			File destination1=new File("C:\\Users\\91976\\eclipse-workspace\\Automation3\\logo.png");
			FileUtils.copyFile(scr, destination1);
		}
	}
}
