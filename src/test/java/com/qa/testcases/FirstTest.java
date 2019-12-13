package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	

	WebDriver driver;
	
	@BeforeTest
	
	public void launchBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/virajakaveri/eclipse-workspace/AmazonAutomation/chromedriver");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://in.yahoo.com/");
		
		
	}

	
	
		@Test
		
		public void  displayTitle() {
			
			
			System.out.println(driver.getTitle());
			
			Assert.assertEquals(driver.getTitle(), "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment");
			
			
		}
		
		
		@AfterTest
		
		public void tearDown() {
			
			driver.quit();
			
			
		}
		
		
}
