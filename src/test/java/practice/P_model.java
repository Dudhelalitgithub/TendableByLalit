package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_model {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       
	       String title=driver.getTitle();
	       System.out.println(title);
	       
	      String currentUrl= driver.getCurrentUrl();
	      System.out.println(currentUrl);
	       
	       driver.manage().window().maximize();  // maximise current wimdow
	       
	       driver.navigate().to("https://www.youtube.com/");
	       
	       driver.navigate().back();  //Move back a single "item" in the browser's history.
	       
	       driver.navigate().forward();//Move a single "item" forward in the browser's history
	       
	       Thread.sleep(5000); 
	       
	       driver.navigate().refresh(); //Refresh the current page
	       
	       driver.close(); // close the current window
	       
	    
	       
	       
	       
	       
	}

}
