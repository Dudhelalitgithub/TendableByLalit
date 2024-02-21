package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggetion_youtube {

	private static final int i = 0;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("online shopping sites");
	    Thread.sleep(3000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@jscontroller=\"Dvn7fe\"]//li"));
		System.out.println(list.size());
		
		for(int i=0; i< list.size(); i++);
		String text= list.get(i).getText();
		System.out.println(text);
		
		if(text.equals("online shopping sites in india")) {
			list.get(i).click();
			
			
		}
	}
}
			
		
//		WebElement search=driver.findElement(By.xpath("//input[@id=\"search\"]"));
//		search.sendKeys("live news");
//		//Thread.sleep(3000);
//		
