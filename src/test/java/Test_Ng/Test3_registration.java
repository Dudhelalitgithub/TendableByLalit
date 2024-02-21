package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_registration {
	ChromeDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	}

	@Test
	public void registration() {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("lalit");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("dudhe");

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9763515513");

		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("lalitdudhe09@gmail.com");

		WebElement Address = driver.findElement(By.xpath("//input[@name='address1']"));
		Address.sendKeys("ambika nager darwha");

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Yavatmal");

		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharashtra");

		WebElement code = driver.findElement(By.xpath("//input[@name='postalCode']"));
		code.sendKeys("445202");

		WebElement drowpdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(drowpdown);
		select.selectByVisibleText("INDIA"); // select by visible text

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("lalit@123");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123@123");

		WebElement confirmpass = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpass.sendKeys("123@123");

		WebElement button = driver.findElement(By.name("submit"));
		button.click();
		//driver.close();
	}

}
