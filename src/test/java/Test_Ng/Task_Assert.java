package Test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_Assert {

	@Test
	public void Registration() {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Lalit");

		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Dudhe");

		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("9763515513");

		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("lalitdudhe09@gmail.com");

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Ambika nager Darwha");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Yavtmal");

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Maharashtra");

		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("445202");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("lalit@123");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123@123");

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("123@123");

		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();

		String Actual = driver.getTitle();
		System.out.println(Actual);

		String Expected = "Register: Mercury Tours";
		Assert.assertEquals(Actual, Expected);

	}
}
