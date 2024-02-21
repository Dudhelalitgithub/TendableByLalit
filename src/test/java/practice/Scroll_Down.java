package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scroll_Down {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    
	    JavascriptExecutor js=driver;
	    
	   //js.executeScript("window.scrollBy(0,1600)", "");  // top to bottom
	    
	    //Thread.sleep(3000);
	    //js.executeScript("window.scrollBy(0,-1600)", "");  // bottom to top*/
	    
	    Thread.sleep(3000);
	    WebElement GluconD=driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/41KuRShR97L._AC_SY200_.jpg']"));
	    Thread.sleep(3000);
	    js.executeScript("arguments[0].scrollIntoView()",GluconD);
	    GluconD.click();
	   Thread.sleep(3000);
 
	    
	    
	    
	}

}
