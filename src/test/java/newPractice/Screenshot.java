package newPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String [] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts=driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn =new File("C:\\Users\\91976\\eclipse-workspace\\Automation3\\test-output\\priyanka.png");
	
	FileUtils.copyFile(src, destn);
	
	
	}
}
