package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.youtube.com/");
		Driver.manage().window().maximize();

		WebElement Search = Driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		Search.sendKeys("youtube");
		
		Thread.sleep(300);

		List<WebElement> list = Driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]//li"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();

			System.out.println(text);
		}
	}

}
