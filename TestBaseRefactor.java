package com.cleartrip.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseRefactor {

	protected static WebDriver driver = null;
	
	String testCaseName;
	
	protected static String BASE_URL="http://cleartrip.com";
	
	
	protected void setUp(){
		
	}
	
	public static void initializeWebDriver(){
		
		if(null==driver){
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
		}
	}
	
	public static void openPage(String url){
		
		driver.get(url);
	}
	
	public WebDriver getWebDriver(){
		
		//security check needed 
		
		initializeWebDriver();
		return driver;
	}


}
