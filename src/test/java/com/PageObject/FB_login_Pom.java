package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FB_login_Pom {

	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement Text_Email ;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement Text_Pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement Button_login;
	
	@FindBy(how=How.XPATH,using="//a[text()='Forgotten password?']") private WebElement Forgotten_pass;
	
	@FindBy(how=How.XPATH,using="//a[contains(@id,'u_0_0_')]") private WebElement Create_Account;
	
	@FindBy(how=How.XPATH,using="//a[text()='Create a Page']") private WebElement Create_Page;
	
	// now Create Getter Method 

	public WebElement getText_Email() {
		return Text_Email;
	}

	public WebElement getText_Pass() {
		return Text_Pass;
	}

	public WebElement getButton_login() {
		return Button_login;
	}

	

	public WebElement getForgotten_pass() {
		return Forgotten_pass;
	}

	

	public WebElement getCreate_Account() {
		return Create_Account;
	}

	

	public WebElement getCreate_Page() {
		return Create_Page;
	}

	
	
	
	
	
}
