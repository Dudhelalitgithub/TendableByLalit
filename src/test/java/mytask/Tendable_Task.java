package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tendable_Task {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		
		WebElement ourstory = driver.findElement(By.xpath("//a[text()='Our Story']"));

		if (ourstory.isEnabled()) {
			System.out.println("our Story is Accessible");
		} else {
			System.out.println("our Story is not not accesible");
		}

		WebElement oursolution = driver.findElement(By.xpath("//a[text()='Our Solution']"));
		if (oursolution.isEnabled()) {
			System.out.println("our Solution is Accessible");
		} else {
			System.out.println("our Solution is not not accesible");
		}

		WebElement WhyTengable = driver.findElement(By.xpath("//a[text()='Why Tendable?']"));
		if (WhyTengable.isEnabled()) {
			System.out.println("Why Tengable is Accessible");
		} else {
			System.out.println("Why Tengable is not not accesible");
		}
		
		
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		
		driver.findElement(By.xpath("//button[text()='Contact']")).click();
		
		driver.findElement(By.id("form-input-fullName")).sendKeys("Lalit Dudhe");
		
		driver.findElement(By.id("form-input-organisationName")).sendKeys("Sakav Technology");
		
		driver.findElement(By.id("form-input-cellPhone")).sendKeys("9763515513");
		
		driver.findElement(By.id("form-input-email")).sendKeys("lalitdudheofficial@gmail.com");
		
		
		WebElement JobRole=driver.findElement(By.id("form-input-jobRole"));

		Select s=new Select(JobRole);
		s.selectByIndex(5);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("form-input-consentAgreed-0")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		Thread.sleep(3000);
		
		WebElement error=driver.findElement(By.className("ff-form-errors"));
		
		if(error.isDisplayed()) {
			System.out.println("erroe message is appeared:" + error.getText());
		}
		
		else {
			System.out.println("erroe message not appeared");
		}
	
	}

}
