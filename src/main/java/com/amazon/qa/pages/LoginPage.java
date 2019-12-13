package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(id="nav-link-accountList")
	WebElement loginNavigate;
	
	
	@FindBy(name="email")
	WebElement username;
	
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement submitButton;
	
	
	
	
	public LoginPage () {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public String getLoginPageTile() {
		
		loginNavigate.click();
		return driver.getTitle();
		
	}
	
	
	
	public HomePage signIn(String uname, String passwd) {
		
		loginNavigate.click();
		username.sendKeys(uname);
		continueButton.click();
		password.sendKeys(passwd);
		submitButton.click();	
		return new HomePage();
				
	}
	
	

}
