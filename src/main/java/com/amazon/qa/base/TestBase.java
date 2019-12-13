package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public TestBase () {
		
		
		try {
			
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("/Users/virajakaveri/eclipse-workspace/AmazonAutomation/src/main/java/com/amazon/qa/configproperty/config.properties");
			
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void initialize() {
		
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/virajakaveri/eclipse-workspace/AmazonAutomation/chromedriver");
		
		driver = new ChromeDriver();
		
	} else if(browserName.equals("FF")) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/virajakaveri/eclipse-workspace/AmazonAutomation/geckodriver");
		
		driver = new FirefoxDriver();
		
	}
		
	
	System.out.println("The driver is initialized" +driver);
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
		
	}

}
