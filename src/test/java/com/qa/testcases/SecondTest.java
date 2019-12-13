package com.qa.testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;

public class SecondTest extends TestBase {
	
	
	public SecondTest() {
		
		
		super();
		
	}
	
	@BeforeMethod
	
	public void launchBrowser() {

			
		initialize();
		
		
	}
	
	
	
	
	@Test
	
	
	public void sampleTest() {
		
		
		System.out.println("Hello POM");
	}
	
	
	@AfterMethod 
	
	public void tearDown() {
		
		driver.quit();
		
		
		
	}
	

}
