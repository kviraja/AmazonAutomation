package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest(){
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setUp() {
		
		initialize();
		
		loginPage= new LoginPage();
		
		
	}
	
	
	@Test
	
	public void validateLoginPageTitle() {
		
		String pageTitle=loginPage.getLoginPageTile();
		Assert.assertEquals(pageTitle, "Amazon Sign-In");
		
		
	}
	
	
	@Test
	
	public void validateLoginFunction() {
		
		homePage=loginPage.signIn(prop.getProperty("username"), prop.getProperty("password"));
			
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
		
	}

}
